package jp.ac.uryukyu.ie.e195746;

public class GameMaster {
    Board board;

    GameMaster(Board board) {
        this.board = board;
        System.out.println("ゲームを開始します");
    }

    boolean isSpace(int number, int alphabet) {
        if (board.getUnit(number,alphabet).equals(board.getUnit())) {
            return true;
        }
        else {
            return false;
        }
    }
}
