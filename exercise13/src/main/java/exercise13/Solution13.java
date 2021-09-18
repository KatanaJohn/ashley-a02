package exercise13;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */



//pseudocode goes here
/*

Ask for input for the principal, rate, years, and times compounded
use the calculation function to calculate compounded interest
    divide rate by 100
    use math.pow to find exponent
    find compounded interest by multiplying the principal and exponent and round to neareset penny

 */

import java.util.Scanner;


public class Solution13 {

    private static final Scanner input = new Scanner(System.in);

    public static double calculation(int principal, double rate, int years, int timesCompounded)
    {
        double compoundedInterest;
        rate = rate / 100.0;
        double exponent = Math.pow(1+(rate / timesCompounded), (timesCompounded * years));
        compoundedInterest =  Math.ceil(principal * exponent * 100) / 100.0;
        return compoundedInterest;
    }

    public static void main(String[] args)
    {

        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();

        System.out.print("What is the rate? ");
        double rate = input.nextDouble();


        System.out.print("What is the number of years? ");
        int years = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int timesCompounded = input.nextInt();

        double finalTotal = calculation(principal, rate, years, timesCompounded);

        System.out.print("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + timesCompounded + " times per year is $" + finalTotal);
    }

}
