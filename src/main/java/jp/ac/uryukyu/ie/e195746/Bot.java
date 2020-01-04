package jp.ac.uryukyu.ie.e195746;

import java.util.Random;

public class Bot extends Player {
    Bot(String unit, Board board) {
        super(unit, board); }


    int getNumber(){
        Random random1 = new Random();
        int number = random1.nextInt(3);
        return number; }


    int getAlphabet(){
        Random random2 = new Random();
        int alphabet = random2.nextInt(3);
        return alphabet;}
}
