package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);

        int usernumber;
        int goldenAnswer = 99;
        do
        {
            System.out.println("Please enter the number 99.");
            usernumber = userinput.nextInt();
        }
        while (usernumber != goldenAnswer);

        System.out.println("99 I've been waiting so long.");

    }
}
