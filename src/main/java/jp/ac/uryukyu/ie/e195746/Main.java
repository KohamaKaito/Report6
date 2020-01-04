package jp.ac.uryukyu.ie.e195746;


public class Main {
    public static void main(String[] args) {
        Board board1 = new Board("⬜");
        User user1 = new User("⭕", board1);
        Bot bot1 = new Bot("❌", board1);
        board1.showboard();

        while (true){
            while (true){
                int number = user1.getNumber();
                int alphabet = user1.getAlphabet();
                user1.play(number, alphabet);
                break;
            }
            while (true){
                int number = bot1.getNumber();
                int alphabet = bot1.getAlphabet();
                bot1.play(number, alphabet);
                break;
            }
        }
    }
}
