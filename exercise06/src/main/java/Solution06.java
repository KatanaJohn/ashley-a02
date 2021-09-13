/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Ashley
 */



import java.util.Calendar;
import java.util.Scanner;

//pseudocode




/*
notes:
- create program determining years till retirement and the year you can retire
- computer already has year
- ask for age
- ask what age to retire
- convert those strings to years.
- do subtraction for it
"You have %d years left until you can retire
- its %d year, so you can retire in %d
 */



public class Solution06 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        String str1 = input.nextLine();
        int currentAge = Integer.parseInt(str1);

        System.out.print("At what age would you like to retire? ");
        String str2 = input.nextLine();
        int retireAge = Integer.parseInt(str2);

        int yearsTillRetire = retireAge - currentAge;
        int yearOfRetire = currentYear + yearsTillRetire;


        System.out.print("You have " + yearsTillRetire + " left until you can retire\n");
        System.out.print("It's " + currentYear + ", so you can retire in " + yearOfRetire + "\n");
    }


}
