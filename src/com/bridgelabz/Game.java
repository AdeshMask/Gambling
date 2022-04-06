package com.bridgelabz;

public class Game {

    public void play(double stake, int times, int goal) {
        double tempStake = stake;
        int tempTime = times;
        int bets = 0;
        int win = 0;
        int lose = 0;
        double p=Math.random();
        System.out.println(p);
        while(tempStake != 0 && tempStake != goal){
            if (Math.random() > 0.5) {
                tempStake++;
                win++;
                System.out.println("Won: " + tempStake);
            } else {
                tempStake--;
                lose++;
                System.out.println("Loss: " + tempStake);
            }
        }

    }
}
