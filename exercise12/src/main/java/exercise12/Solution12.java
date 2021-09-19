package exercise12;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;

public class Solution12 {

    private static final Scanner input = new Scanner(System.in);

    public static double calculation(int principal, double interest, int years)
    {
        double total;
        interest = interest / 100.0;
        total = Math.ceil(principal * (1+ interest * years) * 100) / 100;

        return total;
    }

    public static void main(String[] args)
    {


        System.out.print("Enter the principal: ");
        int principal = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        double interest = input.nextDouble();


        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double investmentWorth = calculation(principal, interest, years);

        System.out.print("After " + years + " years at " + interest + "%, the investment will be worth $" + investmentWorth);

    }
}
