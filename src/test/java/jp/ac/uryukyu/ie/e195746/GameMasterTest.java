package jp.ac.uryukyu.ie.e195746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameMasterTest {

    @Test
    void isSpace() {
        int number = 0;
        int alphabet = 0;
        int actual;

        Board board = new Board("⬜");
        board.apdateBoard(number,alphabet,"⭕");
        //(0,0)は空白ではく⭕が入ってる

        if (board.getUnit(number,alphabet).equals(board.getUnit())) {
            actual = 0;  //(0,0)は空白である
            System.out.println("");
        }

        else {
            actual = 1;  //(0,0)は空白ではない
        }


        int expect = 1;  //(0,0)には⭕が入ってるので期待値は１

        assertEquals(expect,actual);


    }
}