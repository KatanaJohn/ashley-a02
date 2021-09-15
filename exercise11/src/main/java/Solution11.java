/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */



import java.util.Scanner;




/*
create currenctConversion method that includes a conversion function
ask for input for euros and the exchange rate using scanner input
find the overall rate/total after conversion using the conversion function
    multiply the euros by conversion rate and use math.ceil to always round up to nearest penny
print the amount of euros at the certain exchange rate and its value.
 */





public class Solution11 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        currencyConversion getCurrency = new currencyConversion();

        System.out.print("How many euros are you exchanging? ");
        double euro = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double dollar = input.nextDouble();

        double rate = getCurrency.conversion(euro, dollar);


        System.out.printf("%.2f euros at an exchange rate of %.4f is %.2f U.S. dollars", euro, dollar, rate);

    }

}
