package com.company;

public class Main {

    public static void main(String[] args) {

//        for (int i = 2; i < 9; i++) {
//            System.out.println("10.000 at " + i + "% interest = " + calculateInterest(10000.0, i));
//        }

//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10.000 at " + i + "% interest = " + calculateInterest(10000.0, i));
//        }

//        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        int count = 0;
        for (int i = 1; i < 50; i++)
            if (isPrime(i))
            {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count == 10)
                {
                    System.out.println("Exit for loop.");
                    break;
                }
            }


//        System.out.println("#####################");
//        for (int i = 1; i < 100; i++)
//            System.out.println("i/2 = " + i / 2 + " Math.sqrt(i) = " + Math.sqrt(i));

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1)
        {
            return false;
        }
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }


}


