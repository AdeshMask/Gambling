package com.bridgelabz;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

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
                    if (tempStake == stake /2){
                        System.out.println("You can resign from the game:\n Press 1 for resign for the day \n press 2 for continue:");
                        int choice = scanner.nextInt();
                        if (choice == 1)
                            break;
                        else
                            continue;
                    }
                } else {
                    tempStake--;
                    lose++;
                    System.out.println("Loss: " + tempStake);
                    if (tempStake == stake /2){
                        System.out.println("You can resign from the game:\n Press 1 for resign for the day \n press 2 for continue:");
                        int choice = scanner.nextInt();
                        if (choice == 1)
                            break;
                        else
                            continue;
                    }
                }
            }
            else System.out.println("You can't play anymore:");
        }
        System.out.println("Stake: "+stake);
        System.out.println("Tempstake:"+tempStake);
        System.out.println("Win: "+win);
        System.out.println("Loose: "+lose);
        System.out.println("times:"+tempTime);
    }
}
