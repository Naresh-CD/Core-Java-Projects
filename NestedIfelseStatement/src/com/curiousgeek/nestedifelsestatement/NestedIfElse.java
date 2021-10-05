package com.curiousgeek.nestedifelsestatement;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        int n = 10;

        if (n > 10) {
            System.out.println(n + " " + "is greater than 10");
        } else if (n == 10) {
            System.out.println(n + " " + "is equal to 10");
        } else {
            System.out.println(n + " " + "is less than 10");
        }
    }
}
