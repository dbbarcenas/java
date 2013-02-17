/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userwhileloop;

import java.util.Scanner; // import the Scanner class to keyboard input

//This class allow the user to enter sales #'s and calculate the commission
public class Userwhileloop {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in); // variable input will collect keyboard entries
       String keepGoing = "y";  //this variable will be used to decide when to exit the program
       
       
       double sales, commission;
       final double COMMISSION_RATE = 0.1; // this declares 0.1 to be constant value 
       
       // establish a loop that will continue until the user tells us to end
       while (keepGoing.equals("y"))
       {
           // ask the user for the amount of sales
           System.out.print("Enterthe amount of sales : $");
           sales = input.nextDouble();  // set the variable to be the aount
                                        // entered on the keyboard
           input.nextLine();            //purge the contents of hte scanner object 50
           
           //calculate the commission
           commission = sales * COMMISSION_RATE;
           
           // Display the commission
           System.out.printf("\nThe comission is %.2f", commission); // %.2f means show 2 decimal
           
           //check if the user wants to enter more data
           System.out.print("\n\nDo you want to calculate another? (y/n)");
           keepGoing = input.nextLine();
                  
       
       }
       
       
    }// end of main method
} // end of class
