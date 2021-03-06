package com.company;

public class Main {

    public static void main(String[] args) {
        // with of int = 32 (4 bytes).
        int myIntValue = 5 / 3;
        // with of float = 32 (4 bytes).
        float myFloatValue = 5f / 3f;
        // with of double = 64 (8 bytes).
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);

    }
}
