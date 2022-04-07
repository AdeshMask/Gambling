package com.bridgelabz;

import java.util.Scanner;

public class Game {

    public void play(double stake, int times, int goal) {
        double tempStake = stake;
        int tempTime = times;
        int bets = 0;
        int win = 0;
        int lose = 0;
        while(tempStake != 0 && tempStake != goal) {
            if (tempStake != 0) {
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
            else System.out.println("You can't play anymore:");
        }
    }
}
