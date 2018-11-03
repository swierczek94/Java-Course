package com.company;

public class Main {

    public static void main(String[] args) {

//        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("###############################");
//
//        for (int i = 1; i < 6; i++) {
//            System.out.println("Count value is " + i);
//        }
//
//        System.out.println("###############################");
//
//        count = 0;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while (count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEverNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }


        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;


        while (number <= finishNumber)
        {
            number++;
            if (!isEverNumber(number))
            {
                continue;
            }

            System.out.println("Even number " + number);
            evenNumberFound++;

            if (evenNumberFound >= 5)
            {
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumberFound);


    }

    public static boolean isEverNumber(int number) {
        if ((number % 2) == 0)
        {
            return true;
        } else
        {
            return false;
        }

    }


}
