package com.curiousgeek.loopsexercisefive;

/*Write a program which reads a sequence of positive integers. The program stops when the user fills a negative value and shows the maximum and the minimum of these numbers.
 * Ex: 6 0 5 7 -1 --> max =7, min = 0*/

import java.util.Scanner;

public class LoopsExerciseFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");

        int n = input.nextInt();

        int min = n;
        int max = n;

        if (n >= 0) {
            while (true) {
                n = input.nextInt();

                if (n < 0)
                    break;

                max = n > max ? n : max;
                min = n < max ? n : min;

                /*if (n > max)
                    max = n;
                if (n < min)
                    min = n;*/
            }

            System.out.println("min= " + min + ", max = " + max);
        } else
            System.out.println(n + " is invalid");
    }
}
