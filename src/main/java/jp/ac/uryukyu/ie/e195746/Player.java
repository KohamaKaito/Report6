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


    /**
     * プレイヤークラスのコンストラクタ
     *
     * @param unit   プレイヤーの駒の形（ver1.0,"⭕"or"❌"）
     * @param board  プレイする碁盤の情報
     */
    Player(String unit, Board board){
        this.unit = unit;
        this.board = board;
    }


    /**
     * 任意の場所に駒を置くメソッド
     * アクセサメソッドを用いてBoardクラスの碁盤に駒を置く
     *
     * @param number     碁盤の縦座標
     * @param alphabet   碁盤の横座標
     */
    void play(int number, int alphabet){
        board.setUnit(number,alphabet,unit);
        board.showboard();
    }
}
