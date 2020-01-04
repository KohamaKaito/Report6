package jp.ac.uryukyu.ie.e195746;


public class Board {

    private String[] board[] = new String[3][3];
    private String unit;


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


    void showboard(){
        System.out.println("　A B C");
        for(int i=0; i<3; i++){
            System.out.println(i + board[i][0] + board[i][1] + board[i][2]);
        }
    }


}
