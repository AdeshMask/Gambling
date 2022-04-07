package com.bridgelabz;

import java.util.Scanner;

public class Game {

    public static int stake = 100;
    public static int times = 100;
    public static int goal = 150;
    public int stakes_Won_For_The_Month = 0;
    public int stakes_Looose_For_The_Month = 0;
    static Scanner scanner = new Scanner(System.in);
    int day = 1;

    void gamePlay(){
        for (; day <= 20; day++){
            System.out.println("\nDay: "+day);
            if (stake >= 100) {
                play(stake, times, goal);
            }
            else System.out.println("Not enough Stakes:");
        }
        if (stakes_Won_For_The_Month >= stake){
            System.out.println("Stakes Earn for the month: "+stakes_Won_For_The_Month);
        }
        else {
            System.out.println("Stakes loose for the month: "+stakes_Looose_For_The_Month);
        }
    }

    public void play(int stake, int times, int goal) {
        int tempStake = stake;
        int tempTime = times;
        int win = 0;
        int lose = 0;
        int earnStakeDay = 0;
        int toatalStakes = stake;
            while (tempStake != 0 && tempStake != goal) {
                if (tempStake != 0) {
                    if (tempStake != goal) {
                        if (Math.random() > 0.5) {
                            tempStake++;
                            win++;
                            System.out.println("Won: " + tempStake);
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
        if (earnStakeDay >= stake){
            stakes_Won_For_The_Month = stakes_Won_For_The_Month + earnStakeDay;
        }
        else {
            stakes_Looose_For_The_Month =  earnStakeDay - stakes_Looose_For_The_Month;
        }
            gamePlay();
    }
}
