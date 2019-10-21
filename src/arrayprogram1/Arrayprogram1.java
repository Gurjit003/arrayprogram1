/*
 * Gurjit Singh
 * Thursday Ocotber 17th - 2019
 * This is the first array practice program
 */

package arrayprogram1;
import java.util.Scanner;

/**
 *
 * @author gusin5788
 */
public class Arrayprogram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); // Scanner declared
        
        int [ ] numbers = new int [20]; // Array declaration
        int total = 0; // total declaration
        
        System.out.println("Enter ten integers and they will be added together:"); // Asks the user to input 20 integers
        for (int i = 0; i <= 19; i = i + 1) // For loop which lets the user input 20 integers
        {
           numbers[i] = input.nextInt(); // Receives the 20 integers from the user
           total = total + numbers[i]; // Adds the numbers as the total
        }
        
        System.out.println("");
        System.out.println("The sum of those numbers is: " + total); // Displays the total to the user
    }
    
}
