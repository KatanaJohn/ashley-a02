package exercise18;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
take input of C or F to know what conversion we make
take input for starting temperature
have conversion for celsius to fahrenheit (C = (F − 32) × 5 / 9)
have conversion for fahrenheit to celsius (F = (C × 9 / 5) + 32)
 */


import java.util.Scanner;


public class Solution18 {

    private static final Scanner input = new Scanner(System.in);


    public static String getConversionType()
    {
        System.out.println("Press C to convert from Fahrenheit to Celsius. Press F to convert from celsius to Fahrenheit. ");
        String temperatureConversionChoice = input.nextLine();
        System.out.println("Your Choice: " + temperatureConversionChoice);
        return temperatureConversionChoice;
    }

    public static void main(String[] args)
    {
        double newTemperature = 0;

        //celsius or fahrenheit conversion

       String temperatureConversionChoice = getConversionType();



        if(temperatureConversionChoice.equals("c") || temperatureConversionChoice.equals("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit");
            int inputTemperature = input.nextInt();
            newTemperature = (double) (inputTemperature - 32) * 5 / 9;
        }
        else if(temperatureConversionChoice.equals("f") || temperatureConversionChoice.equals("F"))
        {
            System.out.println("Please enter the temperature in Celsius");
            int inputTemperature = input.nextInt();
            newTemperature = ((double) inputTemperature * 9 / 5) + 32;
        }

        System.out.println("The temperature in Celsius is " + newTemperature);

    }



}
