package jp.ac.uryukyu.ie.e195746;


/**
 * 三目並べを行う碁盤クラス
 * ３×３の二重配列は９マスの正方形を表す
 *
 *
 * String[][] board;  //９マスの碁盤
 * String unit;       //碁盤を構成する単位（ver1.0,"⬜","⭕","❌"）
 */
public class Board {

    private String[] board[] = new String[3][3];
    private String unit;


    /**
     * 碁盤クラスのコンストラクタ
     *
     * @param unit　碁盤を構成する初期値(ver1.0,"⬜")
     */
    public Board(String unit){
        this.unit = unit;
        for(int i=0; i<3; i++){
            this.board[i] = new String[]{unit,unit,unit};
        }
    }

    public String[][] getBoard(){
        return this.board;
    }

    public String getUnit(){
        return this.unit;
    }

    public String getUnit(int number, int alphabet) {
        return board[number][alphabet];
    }

    public void setUnit(int number, int alphabet, String tipe) {
        this.board[number][alphabet] = tipe;
    }


    /**
     * 碁盤の状態を出力するメソッド
     * 可視化しやすいようにガイドとして数値やアルファベットを出力
     */
    void showboard(){
        System.out.println("　A B C");
        for(int i=0; i<3; i++){
            System.out.println(i + board[i][0] + board[i][1] + board[i][2]);
        }
        System.out.println("\n");
    }


}
