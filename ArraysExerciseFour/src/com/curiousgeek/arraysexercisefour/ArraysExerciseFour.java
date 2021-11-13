package com.curiousgeek.arraysexercisefour;

/* Write a program that displays the maximum and minimum elements of an array */

public class ArraysExerciseFour {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            max = (numbers[i] > max) ? numbers[i] : max;
            min = (numbers[i] < min) ? numbers[i] : min;
        }

        System.out.println("max= " + max + ", min= " + min);
    }
}
