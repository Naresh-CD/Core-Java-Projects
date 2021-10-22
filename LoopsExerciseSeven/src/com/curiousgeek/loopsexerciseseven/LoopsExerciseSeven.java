package com.curiousgeek.loopsexerciseseven;

/*Write a program that reads an integer n and displays the nth fibonacci number*/

import java.util.Scanner;

public class LoopsExerciseSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer n: ");

        int n = input.nextInt();

        int result = 0;
        int v1 = 1;
        int v2 = 1;

        for (int i = 1; i <= n - 2; i++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }

        System.out.println("result = " + (result == 0 ? 1 : result));
    }
}
