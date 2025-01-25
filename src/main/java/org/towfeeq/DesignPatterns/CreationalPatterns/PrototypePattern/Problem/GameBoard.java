package org.towfeeq.DesignPatterns.CreationalPatterns.PrototypePattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private List<GamePiece> pieces = new ArrayList<>();

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
}
