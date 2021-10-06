package com.curiousgeek.ifelsecalculator;

import java.util.Scanner;

public class IfElseCalculator {
    public static void main(String[] args) {

        System.out.print("Please enter num1 operator num2: ");

        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        char operator = input.next().charAt(0);
        double num2 = input.nextDouble();

        if (operator == '+')
            System.out.println(num1 + num2);
        else if (operator == '-')
            System.out.println(num1 - num2);
        else if (operator == '*')
            System.out.println(num1 * num2);
        else if (operator == '/')
            System.out.println(num1 / num2);
        else
            System.out.println("Invalid operator");
    }
}
