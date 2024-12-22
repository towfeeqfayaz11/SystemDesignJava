package org.towfeeq.DesignPatterns.CreationalPatterns.PrototypePattern.Problem;

public class GameClientWithoutPrototypePattern {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Green", 5));

        gameBoard.showBoardState();

        // checkpoint this state (save state) before further changes
        GameBoard copiedBoard = new GameBoard();
        for(GamePiece piece : gameBoard.getPieces()) {
            copiedBoard.addPiece(new GamePiece(piece.getColor(), piece.getPosition()));
        }
        // ideally each class should be responsible for creating its own copy, but here we can see
        // the client is creating the copies for these classes and also is tightly coupled, because
        // if for example, the GamePiece has another property to be add apart from `color` and  `position`,
        // then there will be changes required on client side

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