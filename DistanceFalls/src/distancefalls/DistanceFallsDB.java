
package distancefalls;

import java.util.Scanner;


public class DistanceFallsDB {

    //main method
    public static void main(String[]args){
      double time; 
      double distance; // local variables for time and distance 
      double g = 9.8;   // local variable for "g"

      time = getTime(); 
      time = Math.pow(time,2);  // exponential form of time 
      g = Math.pow(g,2);    // exponential form of "g"
      distance =(g *time)/2;    // formula of the distance calculated 
      System.out.printf("\nThe distance fall calculated is %.2f ", distance);  
        
        
    }   // end of main method
    
    // getTime in seconds method 
    public static double getTime(){
        double time;    //the local variable of time 
        
        Scanner inputTime = new Scanner( System.in );   // scanner input 
        System.out.printf("\nInput the time in seconds:");  
        time = inputTime.nextFloat(); 
        
        return time; 
    }// end of getTime method 
    
}


   