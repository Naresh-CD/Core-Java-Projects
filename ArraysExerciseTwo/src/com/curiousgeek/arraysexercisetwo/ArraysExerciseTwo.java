package com.curiousgeek.arraysexercisetwo;

/* Write a program that displays the sum, product, and average of the elements of an integer array [1,2,-3,5,7]. */

public class ArraysExerciseTwo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 5, 7};

        int sum = 0;
        int product = 1;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }

        average = (double) sum / numbers.length;

        System.out.println("sum=" + sum + ", product= " + product + ", average: " + average);
    }
}
