/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;

/*
    assume one gallon covers 350 square feet. (constant)
    prompt for length
    prompt for width
    calculate gallons of paint
    calculate gallons needed to be bought using math.ceil and divide squarefeet by gallon constant
 */


public class Solution09 {

    public static void main(String[] args)
    {
        double gallonConstant = 350;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the length? ");
        String str1 = input.nextLine();
        int length = Integer.parseInt(str1);

        System.out.print("What is the width? ");
        String str2 = input.nextLine();
        int width = Integer.parseInt(str2);

        int squareFeet = length * width;
        int gallonsRequired = (int) Math.ceil(squareFeet / gallonConstant);
        System.out.print("You will need to purchase " + gallonsRequired + " gallons of paint to cover " + squareFeet + " square feet.");




    }
}
