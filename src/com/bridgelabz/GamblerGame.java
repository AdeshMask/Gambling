package com.bridgelabz;

import java.util.Scanner;

public class GamblerGame {

    static Scanner scanner = new Scanner(System.in);
    public static int stake;
    public static int goal;
    public static int times;
    int day = 1;
    public int day_Won = 0;
    public int day_Loose = 0;
    public static int total_Amount_Of_The_Month = 0;
    public static int lucky_Day = 1;
    public static int un_Lucky_Day = 1;
    int n = 0;
    int lucky = 0;
    int unlucky = 0;



    void gamePlay() {
        System.out.println("Enter th amount:");
        stake = scanner.nextInt();
        System.out.println("Enter the goal");
        goal = scanner.nextInt();
        System.out.println("Enetr how many times wants to play");
        times = scanner.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println("\nDay: " + day);
            if (stake >= 100) {
                play(stake, times, goal);
            }
            else System.out.println("Not enough Stakes:");
        }
        System.out.println("\nWinning Days:" +day_Won);
        System.out.println("Loosing Days:" +day_Loose);
        System.out.println("Actual amount" +stake);
        System.out.println("Amount collected at the end of the month is:: " +total_Amount_Of_The_Month);
        if (total_Amount_Of_The_Month > 0) {
            System.out.println("Winning amount of the month is:" + total_Amount_Of_The_Month);
            System.out.println("Total amount is:: " + (total_Amount_Of_The_Month + stake));
        }else {
            System.out.println("Loosing amount of the month is: "+total_Amount_Of_The_Month);
            System.out.println("Total amount is:: " + (stake + total_Amount_Of_The_Month));
        }
        System.out.println("Luckies Day of the Month is: "+ lucky_Day);
        System.out.println("Un-Luckiest day of the Month is: "+un_Lucky_Day);
    }

    public void play(int stake, int times, int goal) {
        int tempStake = stake;
        int tempTime = times;
        int win = 0;
        int lose = 0;
        int bets = 1;
        int i=0;
        int earnStakeDay = 0;
        while (tempStake != 0 && tempStake != goal) {
            if (tempTime > -1) {
                if (tempStake != 0) {
                    if (win != goal) {
                        if (Math.random() > 0.5) {
                            tempStake++;
                            win++;
                            if (tempStake == (stake/2)){
                                System.out.println("Resign for the day:");
                                break;
                            }
                        } else {
                            tempStake--;
                            lose++;
                            if (tempStake == (stake / 2)){
                                System.out.println("Resign for the day:");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Gambler reached to goal.....");
                        break;
                    }
                } else {
                    System.out.println("Stake amount is 0 not able to play now");
                }
            } else {
                break;
            }
            tempTime--;
            bets++;
            }

        System.out.println("\nStakes at the start of the Day: " + stake);
        System.out.println("Won/Loose stakes: " + tempStake);

        if (tempStake > stake){
            earnStakeDay = tempStake -stake;
            System.out.println("Stakes earn for the winning day: "+earnStakeDay);
            day_Won++;
            total_Amount_Of_The_Month = total_Amount_Of_The_Month + earnStakeDay;
            if (earnStakeDay > lucky){
                lucky = earnStakeDay;
                lucky_Day = day;
            }

        }
        else {
            earnStakeDay = stake - tempStake;
            System.out.println("Stakes loose for the day: "+earnStakeDay);
            day_Loose++;
            total_Amount_Of_The_Month = total_Amount_Of_The_Month - earnStakeDay;
            if (earnStakeDay > unlucky){
                unlucky = earnStakeDay;
                un_Lucky_Day = day;
            }
        }
    day++;
    }
}
