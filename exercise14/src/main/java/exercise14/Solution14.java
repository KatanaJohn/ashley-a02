package exercise14;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
declare tax constant
ask for input for the order amount(subtotal) and state.
use method wisconsinCheck
    if statement checking if the state string is WI
    if so, calculate for tax and total and print the subtotal/tax
    print total at the end. (happens no matter what)
 */

import java.util.Scanner;

public class Solution14 {

    private static final Scanner input = new Scanner(System.in);

    public static void wisconsinCheck(String state, double subtotal, double tax)
    {
        double total = subtotal;
        if(state.equals("WI"))
        {
            tax = subtotal * (tax / 100);
            total = subtotal + tax;
            total = Math.ceil(total *100)/100.0;
            System.out.printf("The subtotal is $%.2f%n", subtotal);
            System.out.printf("The tax is $%.2f%n", tax);

        }
        System.out.printf("The total is $%.2f%n", total);
    }


    public static void main(String[] args)
    {
        double tax = 5.5;


        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();
        input.nextLine();

        System.out.print("What is the state? ");
        String state = input.nextLine();

        wisconsinCheck(state, orderAmount, tax);

    }

}
