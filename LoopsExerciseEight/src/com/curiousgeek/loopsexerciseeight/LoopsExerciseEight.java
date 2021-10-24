package com.curiousgeek.loopsexerciseeight;

/* Write a program which displays a string with a space after each character
 * Ex: ab cd --> a b  c d */

public class LoopsExerciseEight {
    public static void main(String[] args) {

        String str = "This is string iteration";

        for (int i = 0; i <= str.length() - 1; i++)
            System.out.print(str.charAt(i) + " ");
    }
}
