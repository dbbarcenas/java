
package lotto.pkg6.pkg09;

/**
 *
 * @author durwinbarcenas
 *
 *  Lab 10  Lotto 6-09 
 * 
 *  1 Get the user's 6 choices of number
 *  2 Validation for your input in range of 0-9
 *  3 Generate random 6 numbers from the computer in a range of 0-9
 *  4 Compare your choice of numbers and the computer's 
 *  5 Determine how many numbers matches then 
 *      depending on the how many numbers match 
 *          determines your winnings 
 */
import java.util.Scanner;
import java.util.Random;
public class Lotto609 {

    
    public static void main(String[] args) {
        int array_match;    // the variable for the both user and computer array
        System.out.println("\tLotto 6-09");         // instructions 
        System.out.println("\nYou have to pick numbers between 1 to 9."); 
        System.out.println("You can only choose 6 of the 9 numbers.");
        
        int user_array[] = getNumbers();  // variable set for getNumbers to user_array
        int comp_array[] =  ranNumbers(); // variable set for ranNumbers to comp_array 
        
        array_match = arrayMatch(user_array, comp_array);   // this variable makes up the arrayMatch function 

            System.out.printf("\nThere is %d matches in your Lotto\n" , array_match);
            
            if (array_match == 0) // this matches your winnings a bunch of (if statements)  
                System.out.printf("\nNot a single match! Try your luck again!\n");
            if (array_match == 1)
                System.out.printf("You won $1! Best to try again.\n");
            else if (array_match == 2)
                System.out.printf("You won $10! Best to try again.\n");
            else if (array_match == 3)
                System.out.printf("You won $100! Not bad.\n");
            else if (array_match == 4)
                System.out.printf("YOu won $1,000! Nice! But not good enough.\n");
            else if (array_match == 5)
                System.out.printf("You won $10,000! Wow! Congratulations!\n");
            else if (array_match == 6)
                System.out.printf("You won $100,000! Jackpot!\n");
                    
        
    }   // end of main method 
    
    // this method gets the user's 6 number of choices
    // into an array then validates your input
    public static int[] getNumbers (){
        
        Scanner keyboard = new Scanner(System.in);
        int[] userNum = new int[6];   // 6 elements of the variable 
        System.out.printf("Input your number of choices.");
        for (int index=0; index < userNum.length; index++)  // array of the variable element 
        {
            System.out.printf("\n\nUser Input #%d: ", index+1); //when the input is valid then move on to the next array element 
            userNum[index] = keyboard.nextInt();            // for the next input 
            
                if (userNum[index] < 0 || userNum[index] >= 10)     // validating the user's inputs then retyping it when its invalid 
                {
                    System.out.printf("\nUser's input is invalid, try again.");
                     System.out.printf("\n\nUser Input #%d: ", index+1);   
                         userNum[index] = keyboard.nextInt();    // keyboard input scanner for the user if its not validated 
                }                                                   // retype your choice of number
                
         }  // end of for loop for userNum input 
             System.out.println();
              System.out.printf("User's Numbers:\t\t");
                for (int index = 0; index < userNum.length; index++)    // int index is doing a for loop to display the output of 
               {                                                        // userNum
                 System.out.printf("%d\t", userNum[index]);           // display the user numbers as a table 
               }
           return userNum;  // returns the value 
    }   // end of getUser method 
    
    // this method generates random numbers into an array 
    // then returns the value of the random number
    public static int[] ranNumbers(){
        Random ranGen = new Random();  // Random generator class being set
        int [] ranNum = new int [6];    // int ranNum is being set as an array with, 6 elements within the array
        for (int random = 0; random < ranNum.length; random ++) //ranNum is set as a for loop 
        {
            ranNum[random] = ranGen.nextInt(9);     //  the generator sets the random numbers as a variable within 0-9 numbers
        }    
        
            System.out.println(); 
                    System.out.printf("Lotto Numbers: \t\t");   
                for (int random = 0; random < ranNum.length; random ++) // int random is doing a for loop to display the output of 
                {                                                       // ranNum 
                    System.out.printf("%d\t", ranNum[random]);  //displays the random numbers as a table 
                }
        return ranNum;  // the value of the ranNum is then returned
        }   // end of ranNumbers method 
    
    //this method takes both arrays from a random generating number and the user's input numbers
    // and matches them into an array 
    public static int arrayMatch(int[] array_user, int[] array_comp){
        int array_match = 0;    // the variable array_match combines both arrays 
        
        if (array_user.length != array_comp.length){    // if array_user length is either equals or not equals array_comp length then
            return array_user.length+1;                 // array_user length then value is returned then adds to 1 
        }
             for (int index= 0 ; index < array_user.length; index++)    // loops as much as how manny elements is being set 
             {                                                           // in the array 
                 if (array_user[index] == array_comp[index])      // if array_user and array_comp matches 
                     array_match++;                                 // then adds the a value to 1 
             }
             
         return array_match;    // the array_match variable is then returned 
    }   // arrayMatch method ends
       
}   // Lotto 6-09 class ends 
