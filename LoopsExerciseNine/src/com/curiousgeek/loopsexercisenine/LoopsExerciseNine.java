package com.curiousgeek.loopsexercisenine;

/* Write a program which display the reverse of a string
 * Ex: abcd --> dcba */

public class LoopsExerciseNine {
    public static void main(String[] args) {

        String str = "This is string reverse iteration";
        //String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));
        //reverse += str.charAt(i);
        //System.out.println(reverse);
    }
}
