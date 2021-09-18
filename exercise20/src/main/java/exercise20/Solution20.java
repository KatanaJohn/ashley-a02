package exercise20;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
pseudocode

prompt for the order amount
prompt for the state you live in
prompt for the county you live in
find the tax based on state/county
    wisconsin
        eau claire 0.5%
        dunn county 0.4%
    illinois 8%
add tax to total
 */

import java.util.Scanner;


public class Solution20 {

    private static final Scanner input = new Scanner(System.in);


    public static double getOrderAmount()
    {
        System.out.println("What is the order amount?");
        double orderAmount = input.nextDouble();
        input.nextLine();
        return orderAmount;
    }

    public static String getState()
    {
        System.out.println("What state do you live in?");
        return input.nextLine();
    }

    public static String getCounty()
    {
        System.out.println("What county do you live in?");
        return input.nextLine();
    }


    public static void main(String[] args)
    {

        double tax = 0;

        double orderAmount = getOrderAmount();
        String state = getState();
        String county = getCounty();


        if(state.equals("Wisconsin"))
        {
            if(county.equals("Eau Claire"))
            {
                tax = orderAmount * (5.00 / 100);
                orderAmount += tax;
                orderAmount = Math.ceil(orderAmount *100)/100.00;
            }
            else if(county.equals("Dunn"))
            {
                tax = orderAmount * (4.00 / 100.0);
                orderAmount += tax;
                orderAmount = Math.ceil(orderAmount *100)/100.0;
            }
            else
            {
                System.out.println("Your county is currently not included in our system.");
            }
        }
        else if(state.equals("Illinois"))
        {
            tax = orderAmount * (8.0 / 100);
            orderAmount += tax;
            orderAmount = Math.ceil(orderAmount *100)/100.0;
        }
        else
        {
            System.out.println("Your state is currently not included in our system.");
            System.exit(0);
        }


        System.out.printf("The tax is $%.2f. The total is $%.2f.", tax, orderAmount);
    }
}
