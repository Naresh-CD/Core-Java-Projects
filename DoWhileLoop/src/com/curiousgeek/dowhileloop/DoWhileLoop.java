package com.curiousgeek.dowhileloop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print(" Please enter a number between 1 and 10 : ");
            num = input.nextInt();
        } while (num < 1 || num > 10);

        System.out.println(num + " " + "is between 1 and 10. Thanks!");
    }
}
