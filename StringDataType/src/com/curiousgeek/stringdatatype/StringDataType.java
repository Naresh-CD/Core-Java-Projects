package com.curiousgeek.stringdatatype;

import java.util.Locale;

public class StringDataType {
    public static void main(String[] args) {

        // Creating string object and calling uppercase method and printing
        String aboutString = "String is a class not just a data type and it contains objects, static methods";
        System.out.println(aboutString.toUpperCase());

        // Creating string object and assign to another obj and calling lowercase method and printing
        String firstObj = "THIS IS FIRST OBJ OF STRING";
        String secondObj = firstObj.toLowerCase();
        System.out.println(secondObj);

        // The second string obj is doesn't modify first string obj and printing original string
        System.out.println(firstObj);

        // length() method
        int i = aboutString.length();
        System.out.println(i);

        // isEmpty() method
        boolean e = aboutString.isEmpty();
        System.out.println(e);

        // isBlank() method
        boolean b = aboutString.isBlank();
        System.out.println(b);

        // charAt() method
        char c = aboutString.charAt(15);
        System.out.println(c);

        // IndexOf(), lastIndexOf() methods
        int ind = aboutString.indexOf('c');
        System.out.println(ind);

        int lastInd = aboutString.lastIndexOf('s');
        System.out.println(lastInd);

        // concat() method
        String con = aboutString.concat(" and it has lot of predefined methods");
        System.out.println(con);
    }
}
