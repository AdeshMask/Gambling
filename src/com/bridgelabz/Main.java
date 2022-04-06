package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Stake dollar");
        int stake = scanner.nextInt();
        if (stake >= 100){
            System.out.println("Start the game:");
        }
        else
            System.out.println("Not enough stake of dollars:");
    }
}
