package modules.module1.homework;

public class ChessBoard {
    private Square[][] squares;

    public ChessBoard() {
        squares = new Square[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolean isBlack = (i + j) % 2 == 1;
                squares[i][j] = new Square(null, isBlack);
            }
        }
        // Coloca las piezas iniciales en el tablero
    }

    public Square getSquare(int x, int y) {
        return squares[x][y];
    }

    // Otros métodos para gestionar el tablero de ajedrez, como mover piezas, validar movimientos, etc.
}
