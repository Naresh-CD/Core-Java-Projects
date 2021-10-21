package com.curiousgeek.loopsexercisesix;

/* Write a program which displays the sum of digits of an integer read from the user. */


import java.util.Scanner;

public class LoopsExerciseSix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number: ");

        int n = input.nextInt();

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("sum= " + sum);
    }
}
