package exercise10;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */



/*
prompt for price of item 1, quantity 1, item 2, quantity 2, item 3, quantity 3
calculate subtotal of the items
calculate tax using tax rate of 5.5%
print out the subtotal, tax, then overall total
*/



import java.util.Scanner;

public class Solution10 {

    private static final Scanner input = new Scanner(System.in);


    public static double getFinalTotal(double subtotal, double tax)
    {
        return (subtotal + tax);
    }

    public static void main(String[] args)
    {
        double taxConversion = 0.055;

        System.out.println("Enter the price of item 1: ");
        String item1 = input.nextLine();
        System.out.println("Enter the quantity of item 1: ");
        String quantity1 = input.nextLine();
        System.out.println("Enter the price of item 2: ");
        String item2 = input.nextLine();
        System.out.println("Enter the quantity of item 2: ");
        String quantity2 = input.nextLine();
        System.out.println("Enter the price of item 3: ");
        String item3 = input.nextLine();
        System.out.println("Enter the quantity of item 3: ");
        String quantity3 = input.nextLine();



        int i1 = Integer.parseInt(item1);
        int q1 = Integer.parseInt(quantity1);
        int i2 = Integer.parseInt(item2);
        int q2 = Integer.parseInt(quantity2);
        int i3 = Integer.parseInt(item3);
        int q3 = Integer.parseInt(quantity3);

        double subtotal = (double) (i1 * q1) + (i2 * q2) + (i3 * q3);
        double tax = subtotal * taxConversion;
        double finalTotal = getFinalTotal(subtotal, tax);

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", finalTotal);

    }


}