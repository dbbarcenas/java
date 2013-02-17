/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturedisplay;

import java.util.Scanner;
public class TemperatureDisplay {

    
    public static void main(String[] args) {
        // Define our variable
        Scanner input = new Scanner (System.in);
        int currentTemp;
        
        System.out.print("\n\nInput the outside temperature:");
        currentTemp = input.nextInt();
        
        if (currentTemp <= 0)
            System.out.printf("\n\nOh my gosh!!! its finally winter!");
        
        else 
            System.out.printf("\n\nOh no... wheres our winter?");
        
        
    } // end of main method
}
