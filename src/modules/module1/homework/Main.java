package modules.module1.homework;
public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        // Imprime el tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Square square = chessBoard.getSquare(i, j);
                if (square.isOccupied()) {
                    System.out.print(square.getColor() + " " + square.getPiece().getClass().getSimpleName() + "  ");
                } else {
                    System.out.print(square.getColor() + " Empty  ");
                }
            }
            System.out.println();
        }
    }
}
