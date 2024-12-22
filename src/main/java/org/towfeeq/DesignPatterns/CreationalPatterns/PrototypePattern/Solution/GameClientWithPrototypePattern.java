package org.towfeeq.DesignPatterns.CreationalPatterns.PrototypePattern.Solution;

public class GameClientWithPrototypePattern {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Green", 5));

        gameBoard.showBoardState();

        // checkpoint this state (save state) before further changes
        GameBoard copiedBoard = gameBoard.clone();

        // client code is decoupled now

        System.out.println("copied board");
        copiedBoard.showBoardState();
    }
}

/*
- The prototype pattern can be extremely useful in a board game when you want to save the current state
  of the game (including the board layout and current position of pieces) for undo/redo functionality, checkpoints
  or simply making copy of a board for the new player
- Each piece or game element can provide its own clone method, allowing the entire board to be easily cloned
  with all its current state
- By using the prototype pattern, we decouple the complexity of cloning the board from the client, ensuring that
  each object knows how to clone itself, making the system flexible and easier to maintain
*/