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
    }
}
