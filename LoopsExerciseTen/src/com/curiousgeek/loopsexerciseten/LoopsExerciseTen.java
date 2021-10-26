package com.curiousgeek.loopsexerciseten;

/* Write a program which finds if a string is a palindrome string or not?
 * A palindrome string is read the same starting from the start or the end Ex: noon, aba, a, 12321 */

public class LoopsExerciseTen {
    public static void main(String[] args) {

        String str = "noon";

        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j))
                continue;
            isPalindrome = false;
            break;
        }
        System.out.println(isPalindrome ? "palindrome" : "not palindrome");
    }
}
