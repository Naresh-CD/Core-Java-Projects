package com.curiousgeek.nameandage;

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        /*
        // First implementation
        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.println(name +" " + "you are" +" "+ age +" " + "years old!");
         */

        // Second implementation
        System.out.print("Please enter your name and age: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next() + " " + "you are" +" "+ input.nextDouble() +" "+ "years old!");
    }
}
