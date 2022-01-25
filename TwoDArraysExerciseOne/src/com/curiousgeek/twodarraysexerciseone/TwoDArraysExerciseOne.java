package com.curiousgeek.twodarraysexerciseone;

/* Write a program that prints the sum of each row in a 2D array?
 * Resolve the exercise and print the sum of each column */

public class TwoDArraysExerciseOne {
    public static void main(String[] args) {
        int[][] integers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        /*for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++)
                sum += integers[i][j];
*/
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++)
                sum += integers[j][i];

            System.out.println("The sum of column " + (i + 1) + ": " + sum);
        }
    }
}
