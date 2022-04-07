package com.bridgelabz;

import java.util.Scanner;

public class Game {

    public static int stake = 0;
    public static int times = 1;
    public static int goal = 0;
    static Scanner scanner = new Scanner(System.in);
    int day = 1;

    void gamePlay(){
        for (; day <= 20; day++){
            System.out.println("\nDay: "+day);
            System.out.println("Enter Stake dollar");
            stake = scanner.nextInt();
            if (stake >= 100) {
                System.out.println("Enter goal");
                goal = scanner.nextInt();
                System.out.println("Enter number of times you want to play");
                times = scanner.nextInt();
                play(stake, times, goal);
            }
            else System.out.println("Not enough Stakes:");
        }
    }

    public void play(int stake, int times, int goal) {
        double tempStake = stake;
        int tempTime = times;
        int win = 0;
        int lose = 0;
        double earnStakeDay = 0;
        double toatalStakes = stake;
            while (tempStake != 0 && tempStake != goal) {
                if (tempStake != 0) {
                    if (tempStake != goal) {
                        if (Math.random() > 0.5) {
                            tempStake++;
                            win++;
                            System.out.println("Won: " + tempStake);
                            if (tempStake == (stake+(stake / 2))) {
                                System.out.println("You can resign from the game:\n " +
                                        "Press 1 for resign for the day \n press 2 for continue:");
                                int choice = scanner.nextInt();
                                if (choice == 1){
                                    earnStakeDay = tempStake - stake;
                                    break;
                                }


                                else
                                    continue;
                            }
                        } else {
                            tempStake--;
                            lose++;
                            System.out.println("Loss: " + tempStake);
                            if (tempStake == stake / 2) {
                                System.out.println("You can resign from the game:\n " +
                                        "Press 1 for resign for the day \n press 2 for continue:");
                                int choice = scanner.nextInt();
                                if (choice == 1){
                                    earnStakeDay = stake - tempStake;
                                    break;
                                }else
                                    continue;
                            }
                        }
                    }else {
                        System.out.println("Gambler reached to goal Congratulations.......");
                        System.out.println("Total Stakes earn for the Day = "+(tempStake-stake));
                        break;
                    }
                } else {
                    System.out.println("You can't play anymore:");
                }
            }
            System.out.println("\nStakes at the star of the Day: " + stake);
            System.out.println("times: " + tempTime);
            System.out.println("Won/Loose stakes: " + tempStake);
            System.out.println("Stakes earn for the day: "+earnStakeDay);
            System.out.println("Total Stakes of the day: :" + tempStake);
            day++;
            gamePlay();
    }
}
