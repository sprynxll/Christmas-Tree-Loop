/*
 * Application Title: Christmas Tree
 * Author: Madison McDonald
 * ISCS 140, Programming Foundations I
 * Date: November 9, 2021
 * Purpose: Prints the title for the program.
 */

package pfcountdown;


public class Title
{
    private String strTitle, strTagline;

    // Constructor method that REQUIRES 2 strings t be added
    // to all instructions.
    public Title(String title, String tagline)
    {
        this.strTitle = title;
        this.strTagline = tagline;
    }
    
    public void printTitle()
    {
        System.out.println(strTitle + "\n" + "\t" + strTagline);
    } // End of printTitle() METHOD
     
}
