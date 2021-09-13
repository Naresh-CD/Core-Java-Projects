package com.curiousgeek.integerdatatypes;

public class Main {

    public static void main(String[] args) {
	    byte b = 127;
        short s = 5000;
        int i = 1270000000;
        long l;

        System.out.println(b-i);
        System.out.println(s-i);
        System.out.println(i-s);

        l = i;
        i = s;

        System.out.println(i);
        System.out.println(l);
    }
}
