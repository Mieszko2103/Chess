package models;

import models.Board;
import models.Field;

public class Play {
    public static void main(String[] args) {
        Board board = new Board();

        board.show();
       // System.out.println(board.getBoard()[6][3].getOcupatedBy());
        board.getBoard()[6][3].getOcupatedBy().move(board.getBoard()[7][3]);
        board.show();
    }
}
