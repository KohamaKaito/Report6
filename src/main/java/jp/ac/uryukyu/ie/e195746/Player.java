package jp.ac.uryukyu.ie.e195746;


public class Player {
    String unit;
    Board board;

    Player(String unit, Board board){
        this.unit = unit;
        this.board = board;
    }

    void play(int number, int alphabet){
        board.setUnit(number,alphabet,unit);
        board.showboard();
    }
}
