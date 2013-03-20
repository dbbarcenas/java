/*Author 
 * Durwin B
 */
package nutritionguide;

import java.util.Scanner;
public class NutritionGuide {
    
    public static void main(String[] args) {
        float percentCalFat, fatGrams, calories;   //local variables 
        
        fatGrams = getFat();    // fatGrams is equals the value of getFat function
        calories = getCalories(fatGrams);   // calories is equals getCalories function and fatGrams is also being used inside the module
        percentCalFat = (fatGrams*9)/calories;      //percentCalFat is the formula for calculating the percentage of calories 
        
        System.out.printf("\nThe percentage fat of the food choice is %.2f", percentCalFat);    // prints the output                       
        System.out.printf("%%.\n");                                                          //of the total percentage of the calories
        
        if (percentCalFat < 0.30)       // if percentCalFat is less than 0.30 then 
            System.out.printf("\nLow Fat\n");   // "Low Fat" is being outputed 
        else                            // if percentCalFat is greater than 0.30 then
            System.out.printf("\nHigh Fat\n");  // "High Fat" is being outputed 
    }
   // A function that is able to get you to input the value of fat by grams
    public static float getFat(){
        float fatGramsInput = 0; // the local variable is being set inside the function 
        
        Scanner fat = new Scanner(System.in);   // a Scanner class is being used to scan the user input 
        System.out.printf("Enter the value of Fat grams: ");   
        fatGramsInput = fat.nextFloat();    // this part of the syntax where you input the fat grams value. 
        
        while (fatValidate(fatGramsInput))   // this while loop determines if the value is more than 0
        {
             System.out.printf("Invalid input must be more than 0, Enter the value of Fat again:");
             fatGramsInput = fat.nextFloat();   // input the right value of fat grams inorder to validate 
        }
        return fatGramsInput; // returns the value of fatGramsinput
    }   // end of getFat function
    
    // A function that lets you input the value of calories 
    public static float getCalories (Float fat){  
        float calInput;    // this is the local variable for input 
            
            Scanner calories = new Scanner (System.in);     //scanner class for the measured calories 
            System.out.printf("\nType in the calories of your choice of food: ");
            calInput = calories.nextFloat();   // scanned calories then is set as a userInput Variable 
            
            while (calValidate(calInput,fat))   // determines if the value is more than fat grams x 9
            {
                System.out.printf("Invalid input more than Fat Grams x 9, Enter the vlaue of calories again:");
                calInput = calories.nextFloat();    // re input the value if you typed in the wrong value 
            }
            return calInput;   // then the value is returned 
        
   }    // end of getCaloriesMethod 
    
    // a method that decides weather the value inputed is valid  or not valid 
    public static boolean fatValidate(float fatUserInput){
        if (fatUserInput > 0)   // if fatUserInput is greater than 0 then 
        {                       
            return false;       // it returns the value as false 
        }
        else                    // else it would return the value as true
            return true; 
    }   // end of method fatValidatet 
    
    // a method for validating the value of calories 
    public static boolean calValidate(float calUserInput , float fat){
        if (calUserInput > fat*9)   // if caluserInput is greater than fat grams x9 then 
        {
            return false;       // it returns the value as false 
        }
        else 
            return true;        // else it would return the value as true 
    }
}
