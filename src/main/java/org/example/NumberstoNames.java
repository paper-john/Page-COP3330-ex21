package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class NumberstoNames
{
    public static void main( String[] args )
    {
        //declare variables
        int num;
        Scanner input = new Scanner(System.in);

        //Get user input
        System.out.print("Please enter the number of the month: ");
        num = input.nextInt();

        //list months in switch case
        String month;
        switch (num)
        {
            case 1: month = "January";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            default: month = "Invalid month";
                break;
        }
        //Display Result
        System.out.println("The name of the month is " +month+ ".");
    }
}
