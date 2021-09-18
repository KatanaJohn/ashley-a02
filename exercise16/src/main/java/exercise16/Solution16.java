package exercise16;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */


/*
have static age requirement of 16
take input for age
create method/function for checking password
    if/else statement
    if password is correct, "Welcome!"
    else, say "I don't know you"
 */


import java.util.Scanner;


public class Solution16 {

    public static void check(int age)
    {
        String result = (age >= 16) ? "are" : "are not";

        System.out.printf("You %s old enough to legally drive.", result);
    }



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = input.nextInt();

        check(age);
    }
}
