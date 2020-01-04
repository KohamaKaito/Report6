package jp.ac.uryukyu.ie.e195746;

import java.util.Scanner;

/**
 * ユーザクラス
 * 任意の場所を指定して駒を置く
 *
 *
 * String unit;  //ユーザの駒の形（ver1.0,"⭕"or"❌"）
 * Board board;  //プレイする碁盤の情報
 */
public class User extends Player {
    User(String unit, Board board) {
        super(unit, board);
    }

    int getNumber(){
        System.out.println("(" + unit + "):あなたのターンです。");
        System.out.println("(" + unit + "):数字を入力してください。");
        Scanner scan_num = new Scanner(System.in);
        String num = scan_num.nextLine();
        int number = Integer.parseInt(num);
        return number; }


    int getAlphabet(){
        System.out.println("(" + unit + "):アルファベットを入力してください。");
        Scanner scan_alp = new Scanner(System.in);
        String alp = scan_alp.nextLine();
        int alphabet = trans(alp);
        return alphabet; }


    int trans(String alphabet) {
        switch (alphabet){
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            default:
                return 3; } }


}
