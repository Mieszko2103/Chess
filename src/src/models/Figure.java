package models;

public abstract class Figure {
     protected char icon;
     private boolean isWhite;
     protected Field courrentField;

     protected boolean move(Field moveTo){
         return false;
     }

    public boolean isWhite() {
        return isWhite;
    }

    public Figure(boolean isWhite, Field courrentField) {
        this.isWhite = isWhite;
        this.courrentField = courrentField;
    }

    public char getIcon() {
        return icon;
    }
}
