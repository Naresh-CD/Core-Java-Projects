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
    }
}
