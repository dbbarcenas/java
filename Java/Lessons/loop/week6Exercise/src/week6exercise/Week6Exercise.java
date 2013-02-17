/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week6exercise;


public class Week6Exercise {

   
    public static void main(String[] args) {
        
        for (int counter = 1; counter <=100; counter ++)
        {
            System.out.printf("%d\t", counter);
            
            if ((counter % 5) == 0)
                System.out.println();
            
        }
        
    }
}
