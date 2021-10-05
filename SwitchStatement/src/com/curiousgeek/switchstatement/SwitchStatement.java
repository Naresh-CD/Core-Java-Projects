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
    }
}
