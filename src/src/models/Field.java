package models;

public class Field {
    private char row;
    private int column;
    private Figure ocupatedBy;

    public Figure getOcupatedBy() {
        return ocupatedBy;
    }

    public void setOcupatedBy(Figure ocupatedBy) {
        this.ocupatedBy = ocupatedBy;
    }

    public char getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getPosition(){
        return row+" "+String.valueOf(column)+" "+ocupatedBy;
    }

    public Field(char row, int column) {
        this.row = row;
        this.column = column;
    }
}
