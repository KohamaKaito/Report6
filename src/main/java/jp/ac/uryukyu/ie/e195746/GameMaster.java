package jp.ac.uryukyu.ie.e195746;


/**
 * ルールや審判を担うGameMasterクラス
 * ルールをアルゴリズムで表現
 *
 * Board board; //プレイする碁盤の情報
 */
public class GameMaster {
    Board board;


    /**
     * ゲームマスタークラスのコンストラクタ
     *
     * @param board プレイする碁盤の情報
     */
    GameMaster(Board board) {
        this.board = board;
        System.out.println("ゲームを開始します");
    }


    /**
     * 置きたい場所が空白かどうか調べるメソッド
     * 指定した場所が空白（ver1.0"⬜"）だったらtrueを返す
     *
     *
     * @param number 調べたい碁盤の縦座標
     * @param alphabet 調べたい碁盤の横座標
     * @return 空白であればtrueを返す
     */
    boolean isSpace(int number, int alphabet) {
        if (board.getUnit(number,alphabet).equals(board.getUnit())) {
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * 縦、横、斜めが揃ったか確かめるメソッド
     * 同じ形が３つ揃ったらtrueを返す
     *
     * @param shape 確かめたい形(ver1.0,"⭕"or"❌")
     * @return ３つ揃ったらtrueを返す
     */
    boolean isjudge(String shape) {
        if (isMatch(0,0, shape) && isMatch(0, 1, shape) && isMatch(0, 2, shape)) {
            return true; }

        if (isMatch(1,0, shape) && isMatch(1,1, shape) && isMatch(1,2, shape)) {
            return true; }

        if (isMatch(2,0, shape) && isMatch(2,1, shape) && isMatch(2,2, shape)) {
            return true; }

        if (isMatch(0,0, shape) && isMatch(1,0, shape) && isMatch(2,0, shape)) {
            return true; }

        if (isMatch(0,1, shape) && isMatch(1,1, shape) && isMatch(2,1, shape)) {
            return true; }

        if (isMatch(0,2, shape) && isMatch(1,2, shape) && isMatch(2,2, shape)) {
            return true; }

        if (isMatch(0,0, shape) && isMatch(1,1, shape) && isMatch(2,2, shape)) {
            return true; }

        if (isMatch(0,2, shape) && isMatch(1,1, shape) && isMatch(2,0, shape)) {
            return true; }

        else {
            return false;
        }
    }


    /**
     * 指定した碁盤のマスが指定した形と一致するか確かめるメソッド
     * 指定した場所の文字列と一致したらtrueを返す
     *
     * @param number 確かめる碁盤の縦座標
     * @param alphabet 確かめる碁盤の横座標
     * @param shape 確かめたい形(ver1.0,"⭕"or"❌")
     * @return 指定した場所の文字列と一致したらtrueを返す
     */
    boolean isMatch(int number,int alphabet,String shape){
        return  board.getUnit(number,alphabet).equals(shape);
    }


    /**
     * 引き分けを判断するメソッド
     * 碁盤の２重リストにunitの初期値("⬜")がみつからなかったらtrueを返す。
     *
     * @return 引き分けであればtrueを返す。
     */
    boolean isDraw(){
        for(String[] units: board.getBoard()){
            for (String unit: units){
                if(unit.equals(board.getUnit())){
                    return false;
                }
            }
        }
        return true;
    }
}
