package exercise17;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
take input for gender (1 for M 2 for F)
take input for alcohol
take input for weight in pounds
take in hours it has been since last drinking
calculate BAC
compare to limit and state if its legal for them to drive (or not)
 */

import java.util.Scanner;

public class Solution17 {

    private static final Scanner input = new Scanner(System.in);
    public static final double LEGALLIMIT = 0.08;
    private static final String INVALID_1 = "Number not found. Please enter a number.";


    public static String getGender()
    {
        String gender;
        while(true)
        {
            System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
            String genderNumber = input.nextLine();
            if (genderNumber.equals("1"))
            {
                gender = "male";
                return gender;
            }
            else if (genderNumber.equals("2"))
            {
                gender = "female";
                return gender;
            }
            else
            {
                System.out.println("Unknown number. Please enter 1 or 2.");
            }
        }

    }

    public static double getOuncesConsumed()
    {
        while(true)
        {
            System.out.println("How many ounces of alcohol did you have? ");
            String inputAlcohol = input.nextLine();

            try
            {
                Double.parseDouble(inputAlcohol);
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(INVALID_1);
            }
            if(Double.parseDouble(inputAlcohol) >= 0)
            {
                return Double.parseDouble(inputAlcohol);
            }
            else
            {
                System.out.println("You can't have a negative amount of alcohol.");
            }
        }
    }

    public static void main(String[] args)
    {


        double currentWeight;
        double hoursSinceDrink;
        double alcoholDistributionRatio;


        String gender = getGender();
        //gender check

        double ouncesAlcohol = getOuncesConsumed();

        //take input for ounces of alcohol consumed



        //take input for weight
        while(true)
        {
            System.out.println("What is your weight, in pounds? ");
            String inputWeight = input.nextLine();

            try
            {
                Double.parseDouble(inputWeight);
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(INVALID_1);
            }
            if(Double.parseDouble(inputWeight) >= 0)
            {
                currentWeight = Double.parseDouble(inputWeight);
                break;
            }
        }


        //take input for hours since last drink
        while(true)
        {
            System.out.println("How many hours has it been since your last drink? ");
            String inputHoursSinceDrink = input.nextLine();

            try
            {
                Double.parseDouble(inputHoursSinceDrink);
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(INVALID_1);
            }
            if(Double.parseDouble(inputHoursSinceDrink) >= 0)
            {
                hoursSinceDrink = Double.parseDouble(inputHoursSinceDrink);
                break;
            }
        }





        //BAC calc
        if(gender.equals("male"))
        {
            alcoholDistributionRatio = 0.73;
        }
        else
        {
            alcoholDistributionRatio = 0.66;
        }


        double bacLevel = (ouncesAlcohol * 5.14 / currentWeight * alcoholDistributionRatio) - 0.015 * hoursSinceDrink;





        //state whether its legal to drive or not
        if(bacLevel < LEGALLIMIT)
        {
            System.out.println("Your BAC is " + bacLevel);
            System.out.println("It is legal for you to drive.");
        }
        else
        {
            System.out.println("Your BAC is " + bacLevel);
            System.out.println("It is not legal for you to drive");
        }
    }
}
