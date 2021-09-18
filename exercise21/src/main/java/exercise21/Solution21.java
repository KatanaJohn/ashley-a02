package exercise21;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
ask for number of this month
state the month based on switch cases
display an error if it is outside that range
 */

import java.util.Scanner;



public class Solution21 {

    private static final Scanner input = new Scanner(System.in);

    public static void monthCheck(int month)
    {
        switch (month) {
            case 1 -> System.out.println("The name of the month is January");
            case 2 -> System.out.println("The name of the month is February");
            case 3 -> System.out.println("The name of the month is March");
            case 4 -> System.out.println("The name of the month is April");
            case 5 -> System.out.println("The name of the month is May");
            case 6 -> System.out.println("The name of the month is June");
            case 7 -> System.out.println("The name of the month is July");
            case 8 -> System.out.println("The name of the month is August");
            case 9 -> System.out.println("The name of the month is September");
            case 10 -> System.out.println("The name of the month is October");
            case 11 -> System.out.println("The name of the month is November");
            case 12 -> System.out.println("The name of the month is December");
            default -> System.out.println("Your number is not related to any month");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Please enter the number of this month: ");
        int month = input.nextInt();
        monthCheck(month);

    }
}
