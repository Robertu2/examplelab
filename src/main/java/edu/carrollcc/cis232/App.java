package edu.carrollcc.cis232;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner (System.in);
    	System.out.print("What is your name? ");
        String name = keyboard.nextLine();
        System.out.printf("Hello %s!%n", name);
        keyboard.close();
    }
}
