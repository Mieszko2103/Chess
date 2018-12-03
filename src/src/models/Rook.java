package models;

public class Rook extends Figure {
    public Rook(boolean isWhite, Field field) {
        super(isWhite, field);
        super.icon = 'r';
    }

    @Override
    protected boolean move(Field moveTo) {
        if ((moveTo.getOcupatedBy() == null || (moveTo.getOcupatedBy().isWhite() != this.isWhite())) &&
                ((moveTo.getColumn() == courrentField.getColumn() && moveTo.getRow() != courrentField.getRow()) ||
                        (moveTo.getColumn() != courrentField.getColumn() && moveTo.getRow() == courrentField.getRow()))) {
            moveTo.setOcupatedBy(this);
            courrentField.setOcupatedBy(null);
            this.courrentField = moveTo;
            return true;
        } else {
            System.out.println("Nie mozna wykonać tam ruchu");
            return false;
        }
    }
}