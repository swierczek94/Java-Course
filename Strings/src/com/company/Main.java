package com.company;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this ia more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2018";
        System.out.println("myString is equal to " + myString);

        String numberString = "205.55";
        numberString = numberString + "49.95";
        System.out.println("The rezult is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.57;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);

    }
}
