package com.curiousgeek.ifstatement;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " " + "is even number");
        }

        if (!(n % 2 == 0)) {
            System.out.println(n + " " + "is odd number");
        }

/* ---------------------------------------------------------------------------------------------------------------- */

        int a = 10;

        if (a == 5) {

            System.out.println("Hello");
            System.out.println("a value is 5");

        } else if (a == 7) {

            System.out.println("How are you!");
            System.out.println("a value is 7");

        } else {

            System.out.println("Welcome");
            System.out.println("a value is " + a);
        }


    }
}
