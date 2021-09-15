/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;

//pseudocode goes here
/*
Create an Interestconversion method with calculation function
Ask for input for the principal, rate, years, and times compounded
use the calculation function in compoundInterest to calculate the compounded interest (final total)
    divide rate by 100
    use math.pow to find exponent
    find compounded interest by multiplying the principal and exponent and round to neareset penny

 */


public class exercise13 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        InterestConversion compoundInterest = new InterestConversion();

        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();

        System.out.print("What is the rate? ");
        double rate = input.nextDouble();
        //double ratePercent = rate / 100.0;


        System.out.print("What is the number of years? ");
        int years = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int timesCompounded = input.nextInt();

        double finalTotal = compoundInterest.calculation(principal, rate, years, timesCompounded);

        System.out.print("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + timesCompounded + " times per year is $" + finalTotal);
    }

}
