package jp.ac.uryukyu.ie.e195746;


public class Main {
    public static void main(String[] args) {
        Board board = new Board("⬜");
        User user = new User("⭕", board);
        Bot bot = new Bot("❌", board);
        GameMaster gameMaster = new GameMaster(board);
        board.showboard();

        while (true){
            while (true){
                int number = user.getNumber();
                int alphabet = user.getAlphabet();
                if(gameMaster.isSpace(number,alphabet)){
                    user.play(number, alphabet);
                    break; }
                else {
                    System.out.println("そこには置けません。");
                    board.showboard();} }


            while (true){
                int number = bot.getNumber();
                int alphabet = bot.getAlphabet();
                if(gameMaster.isSpace(number, alphabet)){
                    bot.play(number, alphabet);
                    break; } }
        }
    }
}
