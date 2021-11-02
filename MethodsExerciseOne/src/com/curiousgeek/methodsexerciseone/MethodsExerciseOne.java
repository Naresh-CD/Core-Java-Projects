package com.curiousgeek.methodsexerciseone;

/* Write a method that gets the name of the user and a method that gets the age of user */


import java.util.Scanner;

public class MethodsExerciseOne {
    public static void main(String[] args) {
        System.out.print("Enter your name and age: ");
        System.out.println(getName() + " " + getAge());
    }

    public static String getName() {
        return new Scanner(System.in).nextLine();
    }

    public static int getAge() {
        return new Scanner(System.in).nextInt();
    }
}

