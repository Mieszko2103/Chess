package models;

public class Pawn extends Figure {
    public Pawn(boolean isWhite, Field field) {
        super(isWhite, field);
        super.icon='p';
    }

    @Override
    protected boolean move(Field moveTo){
        if ((moveTo.getOcupatedBy() == null || (moveTo.getOcupatedBy().isWhite() != this.isWhite())) &&
                (moveTo.getRow()==courrentField.getRow()+1 && moveTo.getColumn()==courrentField.getColumn() && !isWhite()) ||
                (moveTo.getRow()==courrentField.getRow()-1 && moveTo.getColumn()==courrentField.getColumn() && isWhite()))
                 {
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