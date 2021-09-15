/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
have static username/password check variables
take input for username and password
create method and function for checking password
    if/else statement
    if password is correct, "Welcome!"
    else, say "I don't know you"
 */


import java.util.Scanner;


public class Solution15 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the username? ");
        String username = input.nextLine();

        System.out.print("What is the password? ");
        String password = input.nextLine();

        userValidate validate = new userValidate();
        validate.passwordCheck(password);
    }

}
