package com.curiousgeek.favoritenumber;

import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
    /*
        // First implementation
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite integer : ");
        int favoriteNumber = input.nextInt();
        System.out.println(favoriteNumber + " " + "is my favourite number too");
        */

        /*
        // Second implementation
        System.out.print("Enter your favourite integer : ");
        Scanner input = new Scanner(System.in);
        int favouriteNumber = input.nextInt();
        System.out.println(favouriteNumber +" " + "is my favourite number too");
         */

        // Third implementation
        System.out.print("Enter your favourite integer: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt() +" " + "is my favourite number too");
    }
}
