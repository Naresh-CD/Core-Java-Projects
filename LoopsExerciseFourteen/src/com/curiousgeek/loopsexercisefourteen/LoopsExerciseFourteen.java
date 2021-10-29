package com.curiousgeek.loopsexercisefourteen;

/* Write a program that reads a positive integer N and display the following */


import java.util.Scanner;

public class LoopsExerciseFourteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();

        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("*");

            System.out.println();
        }*/

        /*for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n)
                for (int j = 1; j <= n; j++)
                    System.out.print("*");
            else
                for (int j = 1; j <= n; j++)
                    if (j == 1 || j == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");

            System.out.println();
        }*/

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n)
                for (int j = 1; j <= n; j++)
                    System.out.print("*");
            else
                for (int j = 1; j <= n; j++)
                    if (j == 1 || j == n)
                        System.out.print(" ");
                    else
                        System.out.print("*");

            System.out.println();
        }
    }
}
