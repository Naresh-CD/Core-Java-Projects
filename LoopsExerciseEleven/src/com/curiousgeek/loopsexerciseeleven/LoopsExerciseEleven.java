package com.curiousgeek.loopsexerciseeleven;

/* Write a program that reads a positive integer N from the user and displays the following : 1, 22, 333, 4444,.....NNNNN...N*/

import java.util.Scanner;

public class LoopsExerciseEleven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);

            System.out.println();
        }

    }
}
