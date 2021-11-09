package com.curiousgeek.arraysexerciseone;

/* Write a program that fills an array with n integers entered by the user
 * Suppose that the user can enter at least 1 number and at most 20 numbers.*/

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExerciseOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many elements? (Max is 20): ");
        int n = input.nextInt();

        while (n > 20 || n <= 0) {
            System.out.println("Invalid number, try again: ");
            n = input.nextInt();
        }

       /* int[] numbers = new int[n];
        fillArrayOfIntegers(numbers);
        printArrayOfIntegers(numbers);*/


    /*private static void fillArrayOfIntegers(int[] numbers) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();
    }

    private static void printArrayOfIntegers(int[] numbers) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }*/

        Point[] points = new Point[n];
        fillArrayOfPoints(points);
        printArrayOfPoints(points);
    }

    private static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter X and Y for point " + (i + 1) + ": ");
            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.println("The elements are:");
        for (int i = 0; i < points.length; i++)
            System.out.println("(" + points[i].x + ", " + points[i].y + ")");
    }
}

