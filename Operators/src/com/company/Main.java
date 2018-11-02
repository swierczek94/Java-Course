package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResolut = result;

        result = result - 1;
        System.out.println(previousResolut + " - 1 = " + result);

        previousResolut = result;

        result = result * 10;
        System.out.println(previousResolut + " * 10 = " + result);

        previousResolut = result;

        result = result / 5;
        System.out.println(previousResolut + " / 5 = " + result);

        previousResolut = result;

        result = result % 3;
        System.out.println(previousResolut + " % 3 = " + result);

        result = result + 1;
        System.out.println("Result is now: " + result);
        result++;
        System.out.println("Result is now: " + result);
        result--;
        System.out.println("Result is now: " + result);

        result += 2;
        System.out.println("Result is now: " + result);
        result *= 10;
        System.out.println("Result is now: " + result);
        result -= 10;
        System.out.println("Result is now: " + result);
        result /= 10;
        System.out.println("Result is now: " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        else
            System.out.println("It is an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score");

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of this tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen");
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is " + wasCar);


        double var1 = 20d;
        double var2 = 80;
        double taskResult = (var1 + var2) * 25;
        System.out.println("taskResult = " + taskResult);
        taskResult = taskResult % 40;
        System.out.println("Remainder is = " + taskResult);
        if (taskResult <= 20)
            System.out.println("Total was over the limit");

    }

}
