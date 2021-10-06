package com.curiousgeek.luckynumber;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {

        System.out.print("Please enter four-digit number: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (!(num > 999 && num < 10000)) {
            System.out.println(num + " " + "is not a four-digit number");
        } else {
            // if number ABCD
            int fourthDigit = num % 10; //D
            int thirdDigit = (num / 10) % 10; // ABC % 10 = C
            int secondDigit = (num / 100) % 10; // AB % 10 = B
            int firstDigit = (num / 1000) % 10; // A % 10 = A

            if (firstDigit + secondDigit == thirdDigit + fourthDigit)
                System.out.println("This is your lucky number");
            else
                System.out.println("This is not your lucky number");
        }
    }
}