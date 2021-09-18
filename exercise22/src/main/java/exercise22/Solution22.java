package exercise22;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
pseudocode

take input for first number
take input for second number
take input  for third number
compare number 1 to 2 and 3 to see if they're equal
if equal, exit.
if not, compare for largestNumber
print largest number of the 3 numbers
 */

import java.util.Scanner;





public class Solution22 {

    private static final Scanner input = new Scanner(System.in);
    public static void findLargestNumber(int numberOne, int numberTwo, int numberThree)
    {
        int largestNumber;
        if(numberOne == numberTwo && numberOne == numberThree)
        {
            System.out.println("All three numbers are equal.");
        }
        else
        {
            if(numberOne >= numberTwo) {
                largestNumber = numberOne;
            }
            else
            {
                largestNumber = numberTwo;
            }
            if(largestNumber < numberThree)
            {
                largestNumber = numberThree;
            }
            System.out.println("The largest number is " + largestNumber);
        }
    }

    public static void main(String[] args)
    {

        int numberOne;
        int numberTwo;
        int numberThree;


        System.out.println("Enter the first number:");
        numberOne = input.nextInt();

        System.out.println("Enter the second number:");
        numberTwo = input.nextInt();

        System.out.println("Enter the three number:");
        numberThree = input.nextInt();

        findLargestNumber(numberOne, numberTwo, numberThree);



    }

}

