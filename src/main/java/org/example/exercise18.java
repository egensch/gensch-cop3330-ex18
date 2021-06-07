/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner conversion = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        System.out.print("Your choice: ");
        char character = conversion.next().charAt(0);

        if ((character == 'C') || (character == 'c'))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temp = conversion.nextInt();

            double tempC = (temp - 32) * 5 / 9;
            System.out.printf("The temperature in Celcius is %.0f.", tempC);
        }

        if ((character == 'F') || (character == 'f'))
        {
            System.out.print("Please enter the temperature in Celcius: ");
            int temp = conversion.nextInt();

            double tempF = (temp * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.0f.\n", tempF);
        }
    }
}