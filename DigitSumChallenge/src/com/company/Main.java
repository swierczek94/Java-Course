package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 10000000;
        System.out.println("The sum of the digits in number " + number + " is " + sumDigit(number));

    }


    private static int sumDigit(int number) {
        if (number < 10)
        {
            return -1;
        }

        int sum = 0;

        while (number > 0)
        {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;

    }
}


