package com.curiousgeek.loopsexerciseone;

public class LoopsExerciseOne {
    public static void main(String[] args) {

        // To print even numbers in increasing order between 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        // To print odd numbers in increasing order between 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }

        // To print even numbers in decreasing order between 1 to 100
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        // To print odd numbers in decreasing order between 1 to 100
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        // Another way to solve the same program to get even numbers in decreasing order between 1 to 100
        for (int i = 100; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }

        // Another way to solve the same program to get even numbers in increasing order between 1 to 100
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        // Another way to solve the same program to get odd numbers in decreasing order between 1 to 100
        for (int i = 99; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }

        // Using while loop to increase even numbers between 1 to 100
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        // Using while loop to decrease even numbers between 1 to 100
        int i = 100;
        while (i >= 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}
