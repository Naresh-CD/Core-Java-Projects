package com.curiousgeek.loopsexercisefour;

/*Write a program which reads a positive number N from the user then indicates if N is prime or not.
N is prime number if it's divisors are only 1 and N*/

import java.util.Scanner;

public class LoopsExerciseFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");

        int n = input.nextInt();

        // 1st solution
       /* int sum = 1;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                sum += i;
        System.out.println(sum == 1 ? "Prime number" : "Not prime number");*/

        // 2nd solution
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        System.out.println(isPrime ? "Prime number" : "Not prime");
    }
}
