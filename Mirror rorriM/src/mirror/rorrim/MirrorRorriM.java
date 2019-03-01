/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirror.rorrim;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Douglas Pressley on 3/1/19
 * Mirror rorriM Program
 * The program prompts the user for a file and then displays the contents of the file in perfect reverse order
 */
public class MirrorRorriM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare and initialize the test boolean variable to continue the while statement
        boolean test = true;
        // The while statement continues prompting the user for a file name if the FileNotFoundException is caught
        while (test == true)
        {
            // The program tries to run the program, but will fail if there is no file by the name the user enters
            try 
            { 
                // The program prompts the user for the file name
                System.out.print("What's the name of the file you wish to mirror? ");
                // Sets up a scanner so that the user can input the file name
                Scanner stdin = new Scanner(System.in);
                // Initialize the string for the file name
                String fileName = stdin.next();
                // Initialize the file that we wil be reversing
                File mirror = new File(fileName);
                // sets up a new scanner to read the file's text
                Scanner in = new Scanner(mirror);
                // Another while loop, this one loops until there is no more text to read in the file
                while (in.hasNext()) 
                {
                // Set up the StringBuilder so we can use the reverse method
                StringBuilder sb = new StringBuilder(in.nextLine());
                //Print out the lines of the file in reverse while in the loop then back to string
                System.out.println(sb.reverse().toString());
                }
                // turn test false so that the program ends
                test = false;
            }
            // This will catch an exception where the file the user inputs is not found
            catch (FileNotFoundException e)
            {
                // This will tell the user that the file does not exist
                System.out.println("That file does not exist, please try again.");
                // This will tell the user where to store the file so it can be read
                System.out.println("Please make sure your file is stored in: " + (System.getProperty("user.dir")));
            }
        }
    }
}
