package com.curiousgeek.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char operator;
        double number1;
        double number2;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter operator(+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.println("Enter the two numbers one by one");
        number1 = input.nextDouble();
        number2 = input.nextDouble();

        input.close();

        switch (operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", number1, number2, (number1 + number2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", number1, number2, (number1 - number2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", number1, number2, (number1 * number2));
                break;
            case '/':
                if (number2 != 0)
                    System.out.printf("%.2f / %.2f = %.2f", number1, number2, (number1 / number2));
                else
                    System.out.println("Divided by zero situation");
                break;
            default:
                System.out.printf("%c is an invalid operator", operator);
        }

    }
}
