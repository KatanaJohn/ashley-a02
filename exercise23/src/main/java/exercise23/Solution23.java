package exercise23;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
pseudocode
take yes or no questions and use if/else statements for the following:
car silence when turning key?
    y -> battery terminals corded?
        y -> clean terminals (end program)
        n -> replaces cables and try again (end)
    n -> does car make a slicking noise?
        y -> replace battery (end)
        n -> car crank but fail to start?
            y -> check spark plug connections (end)
            n -> does engine start then die?
                y -> does car have fuel injection?
                    y -> get it in for service (end)
                    n > check to ensure choke is opening/closing (end)
                n -> not possible (end)
 */

import java.util.Scanner;




public class Solution23 {

    private static final Scanner input = new Scanner(System.in);
    private static final String INVALID = "An invalid answer was entered.";

    public static String getUserInput()
    {
        return(input.nextLine());
    }


    public static void main(String[] args)
    {
        String userInput;

        System.out.println("Is the car silent when you turn the key? (input y or n)");
        userInput = getUserInput();
        if(userInput.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            userInput = getUserInput();
            if(userInput.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else if(userInput.equals("n"))
            {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
            else
            {
                System.out.println(INVALID);
            }
        }
        else if(userInput.equals("n"))
        {
            System.out.println("Does the car make a slicking noise?");
            userInput = getUserInput();
            if(userInput.equals("y"))
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else if(userInput.equals("n"))
            {
                System.out.println("Does the car crank up but fail to start?");
                userInput = getUserInput();
                if(userInput.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else if(userInput.equals("n"))
                {
                    System.out.println("Does the engine start and then die?");
                    userInput = getUserInput();
                    if(userInput.equals("y"))
                    {
                        System.out.println("Does your car have fuel injection?");
                        userInput = getUserInput();
                        if(userInput.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else if(userInput.equals("n"))
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else if(userInput.equals("n"))
                    {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println(INVALID);
                    }
                }
                else
                {
                    System.out.println(INVALID);
                }
            }
            else
            {
                System.out.println(INVALID);
            }
        }
        else
        {
            System.out.println(INVALID);
        }
    }

}
