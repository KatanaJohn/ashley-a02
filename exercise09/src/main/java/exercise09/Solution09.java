package exercise09;

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


    private static final Scanner input = new Scanner(System.in);


    public static int getLength()
    {
        System.out.println("What is the length?");
        String str = input.nextLine();
        return Integer.parseInt(str);
    }


    public static int getWidth()
    {
        System.out.println("What is the width?");
        String str = input.nextLine();
        return Integer.parseInt(str);
    }


    public static void main(String[] args)
    {

        double gallonConstant = 350;



        int length = getLength();
        int width = getWidth();

        int squareFeet = length * width;
        int gallonsRequired = (int) Math.ceil(squareFeet / gallonConstant);

        System.out.print("You will need to purchase " + gallonsRequired + " gallons of paint to cover " + squareFeet + " square feet.");




    }
}
