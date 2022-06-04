package com.curiousgeek.switchstatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = s.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println(n + " " + "is even number");
                break;
            default:
                System.out.println(n + " " + "is odd number");
        }

/* -------------------------------------------------------------------------------------------- */

        int i = 7;

        switch (i) {

            case 0:
                System.out.println("i is 0");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 5:
                System.out.println("i is 5");
                break;
            case 7:
                System.out.println("i is 7");
                break;
            case 10:
                System.out.println("i is 10");
                break;
            default:
                System.out.println("Matching not found");

        }

    }
}
