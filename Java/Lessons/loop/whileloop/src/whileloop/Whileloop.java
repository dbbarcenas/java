/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;

/**
 *
 * @author 200203740
 */
public class Whileloop {

    //create a variable called testCondition that is of type boolean
    public static void main(String[] args) {
        boolean testCondition;
        testCondition = true;
        
        int dayofMonth = 1; //This variable is type integer and holds the day of the onth
        
        while (testCondition)
        {
            System.out.printf("\nFeburary %d", dayofMonth);
            
            if (dayofMonth ==14)
            {System.out.print(" - Valentines Day");}
            else if (dayofMonth >=25)
            //test to see if we are on the last day of the month
            if (dayofMonth == 28) 
                testCondition = false;
            
            
            dayofMonth = dayofMonth +1; // all be written as dayofMonth++;
        }   //end of while loop
    }
}
