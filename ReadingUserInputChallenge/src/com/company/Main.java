package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scaner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (true)
        {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scaner.hasNextInt();

            if (isAnInt)
            {
                int number = scaner.nextInt();
//                System.out.println("You Eenter: " + number);
                counter++;
                sum += number;
                if (counter == 10)
                {
                    break;
                }
            } else
            {
                System.out.println("Invalid number");
            }

            scaner.nextLine();


        }
        System.out.println("########################");
        System.out.println("Sum = " + sum);
        scaner.close();

    }
}
