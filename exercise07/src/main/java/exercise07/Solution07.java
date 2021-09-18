package exercise07;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */




/*
prompt user to input length
prompt user to input width
state the dimensions inputted in feet
do math for area in feet
use a constant to hold conversion factor
convert answer to meters and create a meters answer variable
state the area in square feet and square meters
*/

import java.util.Scanner;



public class Solution07 {

    private static final Scanner input = new Scanner(System.in);


    public static int getLength()
    {
        System.out.println("What is the length of the room in feet? ");
        String str1 = input.nextLine();
        return Integer.parseInt(str1);
    }

    public static int getWidth()
    {
        System.out.println("What is the width of the room in feet? ");
        String str2 = input.nextLine();
        return Integer.parseInt(str2);
    }


    public static double calculateArea(int length, int width)
    {
        return (double) length * width;
    }


    public static void main(String[] args)
    {


        double conversionFactor = 0.09290304;

        int length = getLength();

        int width = getWidth();

        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");

        double areaInFeet = calculateArea(length, width);
        double areaInMeters = areaInFeet * conversionFactor;

        System.out.println("The area is\n" + areaInFeet + " square feet\n" + areaInMeters + " square meters");

    }

}
