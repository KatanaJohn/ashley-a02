package exercise08;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 John Ashley
 */

/*
get input for number of people
get input for number of pizzas
get input for slices of pizza
calculate for total slices
calculate for slices per person
calculate for leftover slices
display slices per person and leftover slices
*/





import java.util.Scanner;







public class Solution08 {

    private static final Scanner input = new Scanner(System.in);



    public static int getPeople()
    {
        System.out.print("How many people? ");
        String str = input.nextLine();
        return(Integer.parseInt(str));
    }

    public static int getNumberOfPizzas()
    {
        System.out.print("How many pizzas do you have? ");
        String str = input.nextLine();
        return(Integer.parseInt(str));
    }


    public static int getSlicesPerPizza()
    {
        System.out.print("How many slices per pizza? ");
        String str = input.nextLine();
        return(Integer.parseInt(str));
    }


    public static void main(String[] args)
    {

        int people = getPeople();

        int pizzas = getNumberOfPizzas();

        int slices = getSlicesPerPizza();

        int totalSlices = slices * pizzas;
        int slicesPerPerson = totalSlices / people;
        int leftoverSlices = totalSlices - (slicesPerPerson * people);

        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza");
        System.out.print("There are " + leftoverSlices + " leftover pieces.");




    }
}
