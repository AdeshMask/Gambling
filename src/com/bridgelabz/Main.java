package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static double stake = 0;
    public static int times = 1;
    public static int goal = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("Enter Stake dollar");
        stake = scanner.nextDouble();
        System.out.println("Enter goal");
        goal = scanner.nextInt();
        System.out.println("Enter number of times you want to play");
        times = scanner.nextInt();
        game.play(stake,times,goal);
    }
}
