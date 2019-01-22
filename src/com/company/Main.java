package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int userNumber;
        int goldenAnswer = 99;
        do
        {
            System.out.println("Please enter the number 99.");
            userNumber = userInput.nextInt();
        }
        while (userNumber != goldenAnswer);

        System.out.println("99 I've been waiting so long.");

    }
}
