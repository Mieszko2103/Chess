package models;

public class King extends Figure {
    public King(boolean isWhite, Field field) {
        super(isWhite, field);
        super.icon = 'k';
    }

    @Override
    protected boolean move(Field moveTo) {
        if ((moveTo.getOcupatedBy() == null || (moveTo.getOcupatedBy().isWhite() != this.isWhite())) &&
                ((moveTo.getColumn() == (courrentField.getColumn() + 1)) && (moveTo.getRow() == courrentField.getRow() + 1) ||
                        (moveTo.getColumn() == (courrentField.getColumn() + 1)) && (moveTo.getRow() == courrentField.getRow()) ||
                        (moveTo.getColumn() == (courrentField.getColumn() + 1)) && (moveTo.getRow() == courrentField.getRow() - 1) ||

                        (moveTo.getColumn() == (courrentField.getColumn() - 1)) && (moveTo.getRow() == courrentField.getRow() - 1) ||
                        (moveTo.getColumn() == (courrentField.getColumn() - 1)) && (moveTo.getRow() == courrentField.getRow()) ||
                        (moveTo.getColumn() == (courrentField.getColumn() - 1)) && (moveTo.getRow() == courrentField.getRow() + 1) ||

                        (moveTo.getColumn() == courrentField.getColumn()) && (moveTo.getRow() == courrentField.getRow() - 1) ||
                        (moveTo.getColumn() == courrentField.getColumn()) && (moveTo.getRow() == courrentField.getRow() + 1))) {
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
