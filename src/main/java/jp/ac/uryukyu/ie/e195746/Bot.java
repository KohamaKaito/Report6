package jp.ac.uryukyu.ie.e195746;

import java.util.Random;


/**
 * ボットクラス
 * 無作為に場所を指定して駒を置く
 *
 * String unit;  //ボットの駒の形（ver1.0,"⭕"or"❌"）
 * Board board;  //プレイする碁盤の情報
 */
public class Bot extends Player {
    Bot(String unit, Board board) {
        super(unit, board); }


    /**
     * ランダムで碁盤の場所を指定するメソッド
     * 0~2の値を乱数で指定（碁盤の横座標）
     *
     * @return 縦座標の数値
     */
    int getNumber(){
        Random random1 = new Random();
        int number = random1.nextInt(3);
        return number; }


    /**
     * ランダムで碁盤の場所を指定するメソッド
     * 0~2の値を乱数で指定（碁盤の縦座標）
     *
     * @return 横座標の数値
     */
    int getAlphabet(){
        Random random2 = new Random();
        int alphabet = random2.nextInt(3);
        return alphabet;}
}
