package exercise19;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
take input for height
take input for weight
calculate BMI
check if the bmi is within range
if under 18.5, state they are underweight
if over 25, state t hey are overweight

 */


import java.util.Scanner;







public class Solution19 {
    static final double UNDERWEIGHTBMI = 18.5;
    static final double OVERWEIGHTBMI = 25;
    private static final String INVALID = "Number not found. Please enter a number.";
    private static final Scanner input = new Scanner(System.in);

    public static double getWeight()
    {
        while(true)
        {
            System.out.println("What is your current weight in pounds? ");
            String inputWeight = input.nextLine();

            try
            {
                Double.parseDouble(inputWeight);
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(INVALID);
                continue;
            }
            if(Double.parseDouble(inputWeight) >= 0)
            {
                return Double.parseDouble(inputWeight);
            }
        }
    }

    public static double getHeight()
    {
        while(true)
        {
            System.out.println("What is your current height in inches ");
            String inputHeight = input.nextLine();

            try
            {
                Double.parseDouble(inputHeight);
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(INVALID);
                continue;
            }
            if(Double.parseDouble(inputHeight) >= 0)
            {
                return Double.parseDouble(inputHeight);
            }
        }
    }




    public static void main(String[] args)
    {
        double height = getHeight();
        double weight = getWeight();
        double bmi;


        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + bmi);


        
        if(bmi < UNDERWEIGHTBMI)
        {
            System.out.println("You are underweight. You should see your doctor");
        }
        else if(bmi > OVERWEIGHTBMI)
        {
            System.out.println("You are overweight. You should see your doctor");
        }
        else
        {
            System.out.println("You are within the ideal weight range");
        }

    }
}
