/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Ashley
 */



import java.util.Calendar;
import java.util.Scanner;

//pseudocode




/*
- use calendar to get current year
- ask for age
- ask what age to retire
- convert those strings to years.
- use getYears method to do subtraction for years until retirement
- add that value to the current year to get the year you retire
- print how many years and in what year you retire
 */



public class Solution06 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        getYearsTillRetirement getYears = new getYearsTillRetirement();

        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        String str1 = input.nextLine();
        int currentAge = Integer.parseInt(str1);

        System.out.print("At what age would you like to retire? ");
        String str2 = input.nextLine();
        int retireAge = Integer.parseInt(str2);

        //int yearsTillRetire = retireAge - currentAge;
        int yearsTillRetire = getYears.math(retireAge, currentAge);
        int yearOfRetire = currentYear + yearsTillRetire;


        System.out.print("You have " + yearsTillRetire + " left until you can retire\n");
        System.out.print("It's " + currentYear + ", so you can retire in " + yearOfRetire + "\n");
    }


}
