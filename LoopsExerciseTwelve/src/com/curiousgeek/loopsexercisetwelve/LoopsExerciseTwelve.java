package com.curiousgeek.loopsexercisetwelve;

/* Write a program that reads a positive integer N and displays the following *,**,***... */

import java.util.Scanner;

public class LoopsExerciseTwelve {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");

            System.out.println();
        }
        /*for (int j = 1; j <= n - i; j++)
            System.out.print(" ");
        for (int k = 1; k <= 2 * i - 1; k++)
            System.out.print("*");

        System.out.println();*/
    }
}
