package models;

public class Board {
    private Field[][] board = new Field[8][8];


    public Field[][] getBoard() {
        return board;
    }

    public void show() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j].getOcupatedBy() == null) System.out.print("[ ]");
                else if (board[i][j].getOcupatedBy().isWhite()) System.out.print("[" + board[i][j].getOcupatedBy().getIcon() + "]");
                else System.out.print("[" + (char)(board[i][j].getOcupatedBy().getIcon()-32) + "]");
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Field((char) (i + 65), j + 1);
                if (i == 1) board[i][j].setOcupatedBy(new Pawn(true,board[i][j]));
                else if (i == 0 && (j == 0 || j == 7)) board[i][j].setOcupatedBy(new Rook(true,board[i][j]));
                else if (i == 0 && (j == 1 || j == 6)) board[i][j].setOcupatedBy(new Bishop(true,board[i][j]));
                else if (i == 0 && (j == 2 || j == 5)) board[i][j].setOcupatedBy(new Horse(true,board[i][j]));
                else if (i == 0 && j == 3) board[i][j].setOcupatedBy(new Queen(true,board[i][j]));
                else if (i == 0) board[i][j].setOcupatedBy(new King(true,board[i][j]));
               // else if (i == 6) board[i][j].setOcupatedBy(new Pawn(false,board[i][j]));
//                else if (i == 7 && (j == 0 || j == 7)) board[i][j].setOcupatedBy(new Rook(false,board[i][j]));
//                else if (i == 7 && (j == 1 || j == 6)) board[i][j].setOcupatedBy(new Bishop(false,board[i][j]));
//                else if (i == 7 && (j == 2 || j == 5)) board[i][j].setOcupatedBy(new Horse(false,board[i][j]));
//                else if (i == 7 && j == 4) board[i][j].setOcupatedBy(new Queen(false,board[i][j]));
                else if (i == 6 && j==3) board[i][j].setOcupatedBy(new Pawn(false,board[i][j]));
               else if (i == 7 && j==3) board[i][j].setOcupatedBy(new Pawn(true,board[i][j]));
            }
        }
    }
}
