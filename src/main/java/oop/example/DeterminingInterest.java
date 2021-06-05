/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DeterminingInterest
{
    public static void main( String[] args )
    {
        System.out.print( "What is the principal amount? " );
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        double principal = Double.parseDouble(a);

        System.out.print( "What is the rate? " );
        String b = input.nextLine();
        double rate  = Double.parseDouble(b);

        System.out.print( "What is the number of years? " );
        String c = input.nextLine();
        double time  = Double.parseDouble(c);

        System.out.print( "What is the number of times the interest is compounded per year? " );
        String d = input.nextLine();
        int n  = Integer.parseInt(d);

        double interest = principal * Math.pow(1 + ((rate/100) / n), n * time);
        DecimalFormat dF = new DecimalFormat("#.##");

        String output = "$" + principal + " invested at " + rate + "% for " + time
                + " compounded " + n + " times per year is $" + dF.format(interest) + ".";

        System.out.println(output);
    }
}
