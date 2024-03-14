/*
 * Application Title: Christmas Tree
 * Author: Madison McDonald
 * ISCS 140, Programming Foundations I
 * Date: November 9, 2021
 * Purpose: A program that creates a christmas tree that changes height 
 * based on the amount of rows the user enters.
 * Questions: 1.) Is there a way to combine the tree and the tree trunk code more?
 * I couldn't get them to be more together and still create the tree.
 */

package pfcountdown;

import java.util.Scanner;

public class Repeat
{
    // Variable to control the while() loop
    String strGoAgain = "y";
    // Place to enter input to get output
    Scanner scan = new Scanner(System.in);
    
    
    public void goAgain()
    {
        // Runs the program at the choice of the user... the user can enter either
        // "yes" or "y" (in any case (capital or lowercase)) to run again or
        // "n" or "no" or anything other than "yes" or "y" to end the program.
        while(strGoAgain.equalsIgnoreCase("y") || strGoAgain.equalsIgnoreCase("yes"))
        {
                        
            // Code to do things
            // Seperation line (doesn't have much purpse except for making the
            // output easier to read
            System.out.println("----------------------------------------------------------");
            
            // Code to enter user's input
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter height of tree: ");
            int intHeight = scan.nextInt();
            
            // The classic for() loop. Remember to code each of the three
            // parts of the condition; the initialization, the comparison, and the increment
            
            // 
            for(int i = 1; i <= intHeight; i++)
            {
                // Centers tree by adding correct amount of spaces (" ")
                    for (int intSpace = intHeight-i; intSpace > 0; intSpace--)
                {
                    // Print out for spaces
                    System.out.print(" ");
                }
                // Prints out proper amount of stars
                    for (int intStar = 1; intStar <= i; intStar++)
                {
                    // Print out for stars
                    System.out.print("* ");
                }
                    // Prints a new line so nothing gets put on the same line
                    System.out.println();
            } // END OF for(){} loop for tree
            
            // Code for the tree trunk
            // Makes trunk 2 stars tall
            for (int i = 1; i <= 2; i++)
            {
                System.out.print(" ");
            // Centers trunk in the middle of the tree
            for (int intSpace = intHeight - 3; intSpace > 0; intSpace--)
            {
                // Prints spaces so trunk is moved to the right location
                System.out.print(" ");
            }
            // Actually prints out stars (2 for the trunk)
            for (int intStar = 2; intStar > 0; intStar--)
            {
                System.out.print("* ");
            }
            System.out.println();
            } // END OF for(){} loop for tree trunk
            
            
            // Just prints "Merry Christmas!" after the tree is printed
            System.out.println("---------Merry Christmas!---------");
            
            // Asks the user if they would like to run the program again or
            // end it
            System.out.print("\n\nWould you like to draw another tree? (y or n) ");
            strGoAgain = scan.next();
            
        
        } // END OF while() loop.
        
        // Prints "Goodbye!" when program is ended
        System.out.println("Goodbye!");
        
    } // END OF METHOD, goAgain().
} // END OF DRIVER CLASS, main()
