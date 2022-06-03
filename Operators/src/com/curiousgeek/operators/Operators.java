package com.curiousgeek.operators;

/** Write a program to perform a arithmetic operators */

public class Operators {
    public static void main(String[] args) {

        byte x=1;
        byte y=2;

        System.out.println("Result of addition is " + (x+y));
        System.out.println("Result of subscription is " + (x-y));
        System.out.println("Result of multiplication is " + (x*y));
        System.out.println("Result of division is " + (x/y));
        System.out.println("Result of modules is " + (x%y));

/** Unary operators */

        System.out.println("Result of unary minus is " + (-x));

/** Increment and decrement operators */

        System.out.println("Result of increment  is " + (x++)); //Post increment
        System.out.println(x);
        System.out.println("Result of increment  is " + (++x)); //Pre increment
        System.out.println(x);
        System.out.println("Result of decrement is " + (x--)); //Post decrement
        System.out.println(x);
        System.out.println("Result of decrement is " + (--x)); //Pre decrement
        System.out.println(x);

/** Relational operators */

        byte a=10;
        byte b=20;
        byte c=30;

        System.out.println("Result of a>b is " + (a>b));
        System.out.println("Result of a>=b is " + (a>=b));
        System.out.println("Result of a<b is " + (a<b));
        System.out.println("Result of a<=b is " + (a<=b));
        System.out.println("Result of a==b is " + (a==b));
        System.out.println("Result of a!=b is " + (a!=b));

/** Logical operators */

        if(a<b && a<c)
        System.out.println("a is smaller than b,c");

        if(a<b || a<c)
        System.out.println("a is smaller than b,c");

        if(!(a<b))
            System.out.println("a is greater than b");

/** Boolean operators */

        boolean d=true;
        boolean e=false;

        System.out.println(d&e);
        System.out.println(d|e);
        System.out.println(!d);

/** Bitwise operators */

        byte f=9;
        byte g=8;

        System.out.println(~f);
        System.out.println(f&g);
        System.out.println(f|g);
        System.out.println(f^g);
        System.out.println(f<<2);
        System.out.println(f>>2);
        System.out.println(f>>>2);

/** Ternary or conditional operator */

        System.out.println((f<g) ? "f is big" : "g is big");


    }

}
