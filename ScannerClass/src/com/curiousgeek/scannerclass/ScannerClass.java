package com.curiousgeek.scannerclass;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String s = input.next();
        System.out.println("This is a String value: " + s + (4+5));

        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Please enter concatination string: ");
        String sc = input.nextLine();
        System.out.println("This is a String concatination value: " + sc + (4*5));

        System.out.println("Please enter Int value: ");
        int i = input.nextInt();
        System.out.println("This is Int value: " + (i + 20));

        System.out.println("Please enter Double value: ");
        Double d = input.nextDouble();
        System.out.println("This is Double value: " + (d + 20));

        System.out.println("Please enter Float value: ");
        Float f = input.nextFloat();
        System.out.println("This is Float value: " + (f + 20));

        System.out.println("Please enter Boolean value: ");
        Boolean b = input.nextBoolean();
        System.out.println("This is Boolean value: " + b);
    }
}
