/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;

public class Solution12 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        InterestConversion simpleInterest = new InterestConversion();


        System.out.print("Enter the principal: ");
        int principal = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        double interest = input.nextDouble();


        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double investmentWorth = simpleInterest.calculation(principal, interest, years);

        System.out.print("After " + years + " years at " + interest + "%, the investment will be worth $" + investmentWorth);

    }
}
