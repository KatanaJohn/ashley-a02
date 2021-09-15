/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;


/*
declare tax constant
ask for input for the order amount(subtotal) and state.
use stateCheck method and wisconsinCheck
    if statement checking if the state string is WI
    if so, calculate for tax and total and print the subtotal/tax
    print total at the end. (happens no matter what)
 */


public class Solution14 {

    public static void main(String[] args)
    {
        double tax = 5.5;
        Scanner input = new Scanner(System.in);
        stateCheck taxCalc = new stateCheck();


        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();
        input.nextLine();

        System.out.print("What is the state? ");
        String state = input.nextLine();



        taxCalc.wisconsinCheck(state, orderAmount, tax);

    }

}
