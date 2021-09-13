/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;


/*
pseudocode
*/




public class Solution08 {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        String str1 = input.nextLine();
        int people = Integer.parseInt(str1);

        System.out.print("How many pizzas do you have? ");
        String str2 = input.nextLine();
        int pizzas = Integer.parseInt(str2);

        System.out.print("How many slices per pizza? ");
        String str3 = input.nextLine();
        int slices = Integer.parseInt(str3);

        int totalSlices = slices * pizzas;
        int slicesPerPerson = totalSlices / people;
        int leftoverSlices = totalSlices - (slicesPerPerson * people);

        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza");
        System.out.print("There are " + leftoverSlices + " leftover pieces.");




    }
}
