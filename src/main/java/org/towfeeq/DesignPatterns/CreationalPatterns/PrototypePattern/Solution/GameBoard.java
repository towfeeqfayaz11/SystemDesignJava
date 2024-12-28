package org.towfeeq.DesignPatterns.CreationalPatterns.PrototypePattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard>{
    private List<GamePiece> pieces = new ArrayList<GamePiece>();

    public void addPiece(GamePiece piece){
        pieces.add(piece);
    }

    public List<GamePiece> getPieces(){
        return pieces;
    }

    public void showBoardState(){
        System.out.println("Current Board State");
        for(GamePiece piece : pieces){
            System.out.println(piece);
        }
    }

    @Override
    public GameBoard clone() {
        GameBoard newGameBoard = new GameBoard();
        for(GamePiece piece : pieces){
            // deep copy (we are not creating shallow copies here because otherwise
            // any change to piece of board 1 would affect change in board for this case
            newGameBoard.addPiece(piece.clone());

            // shallow copy
            // newGameBoard.add(piece);

            // Note: use of shallow copy/ deep copy depends on case to case basis
        }
        return newGameBoard;
    }
}
/*
NOTE:
    - shallow copy here create a new object but does not clone the objects that
      the original object refers to (only the outer object is copied)
    - deep copy clones the original object and all the objects it refers to (nested objects

*/








