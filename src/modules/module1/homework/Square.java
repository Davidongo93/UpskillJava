package modules.module1.homework;

public class Square {
    private Piece piece;
    private boolean isBlack;


    public Square(Piece piece, boolean isBlack) {
        this.piece = piece;
        this.isBlack = isBlack;
    }

    public boolean isOccupied() {
        return piece != null;
    }

    public String getColor() {
        return isBlack ? "Black" : "White";
    }

    public Piece getPiece() {
        return piece;
    }
}

