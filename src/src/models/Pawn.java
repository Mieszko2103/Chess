package models;

public class Pawn extends Figure {
    public Pawn(boolean isWhite, Field field) {
        super(isWhite, field);
        super.icon='p';
    }
}