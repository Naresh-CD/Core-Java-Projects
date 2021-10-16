package com.curiousgeek.loopsexercisetwo;

// Write a program which reads a sequence of integers from the user and stops by displaying "Number exceeds 100" when the sum of these values exceeds 100.

import java.util.Scanner;

public class LoopsExerciseTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        do {
            System.out.print("Please enter number: ");
            sum += input.nextInt();
        } while (sum <= 100);

        System.out.println("Number Exceeds 100: " + "Total :" + sum);
    }
}
