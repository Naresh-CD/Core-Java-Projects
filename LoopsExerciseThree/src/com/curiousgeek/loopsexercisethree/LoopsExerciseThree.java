package com.curiousgeek.loopsexercisethree;

 /*Write a program which displays the sum of the strict divisors of an integers given by the user.
 Ex: 6 --> 1+ 2+ 3 = 6 */

import java.util.Scanner;

public class LoopsExerciseThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                sum += i;
        //        System.out.print(i + " ");
        //      System.out.println(sum);
        System.out.println(sum + n);
    }
}
