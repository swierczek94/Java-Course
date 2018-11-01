package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 127;
        short myShortValue = 32767;
        int myIntValue = 2147483647;

        long myLongValue = (myByteValue + myShortValue + (long) myIntValue);

        System.out.println("myLongValue =" + myLongValue);

    }
}
