package com.curiousgeek.concatenatingstrings;

public class ConcatenatingStrings {
    public static void main(String[] args) {
        String one = "Curious";
        String two = "Geek";
        String Three = one + " " + two;
        System.out.println(Three + " " + (5 + 6));
        System.out.println("Passionate".concat(" about to learn Java").isEmpty());
    }
}
