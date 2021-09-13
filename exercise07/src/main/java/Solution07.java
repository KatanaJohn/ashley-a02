/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;


/*
prompt user to input length
prompt user to input width
state the dimensions inputted in feet
do math for area in feet
use a constant to hold conversion factor
convert answer to meters and create a meters answer variable
state the area in square feet and square meters

*/





public class Solution07 {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        double conversionFactor = 0.092903;

        System.out.print("What is the length of the room in feet? ");
        String str1 = input.nextLine();
        int length = Integer.parseInt(str1);

        System.out.print("What is the width of the room in feet? ");
        String str2 = input.nextLine();
        int width = Integer.parseInt(str2);

        System.out.print("You entered the dimensions of " + length + " feet by " + width + " feet.");

        int areaInFeet = length * width;
        double areaInMeters = areaInFeet * conversionFactor;

        System.out.println("The area is\n" + areaInFeet + " square feet\n" + areaInMeters + " square meters");

    }

}
