package jp.ac.uryukyu.ie.e195746;


/**
 * 三目並べを行うプレイヤークラス
 * 任意の場所を指定して駒を置く
 *
 *
 * String unit;  //プレイヤーの駒の形（ver1.0,"⭕"or"❌"）
 * Board board;  //プレイする碁盤の情報
 */
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
