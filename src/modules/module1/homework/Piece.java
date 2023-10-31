package modules.module1.homework;

public abstract class Piece {
    private String color; // "White" or "Black"

    public Piece(String color) {
        this.color = color;
    }

    public abstract boolean isValidMove(int startX, int startY, int endX, int endY);
}
