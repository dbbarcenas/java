
package gradecenter;

import java.util.Scanner;
public class GradeCenter {
    
    //These are global variables 
    static short grade1, grade2, grade3, grade4, grade5, grade6;
    static short grade7, grade8, grade9, grade10, grade11;
    static short grade12, grade13, grade14, grade15, grade16, grade17, grade18;
  
    public static void main(String[] args) {
       getGrades(); // this method will collect 18 grades
    }
    
    //This method will collect 18 grades and set the global variable
    //with the grades. Yes, I know global variables are not recommended
    //but we havn't coverd more efficient data structure yet!
    public static void getGrades()
    {
        Scanner inputGrade = new Scanner(System.in);
        
        System.out.printf("\nEnter the first grade:");
        grade1 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the second grade:");
        grade2 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the third grade:");
        grade3 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the fourth grade:");
        grade4 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the fifth grade:");
        grade5 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the sixth grade:");
        grade6 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the seventh grade:");
        grade7 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the eighth grade:");
        grade8 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the nineth grade:");
        grade9 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the tenth grade:");
        grade10 = inputGrade.nextShort();
        
         System.out.printf("\nEnter the 11 grade:");
        grade11 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the 12 grade:");
        grade12 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the 13 grade:");
        grade13 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the 14 grade:");
        grade14 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the 15 grade:");
        grade15 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the 16 grade:");
        grade16 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the 17 grade:");
        grade17 = inputGrade.nextShort();
        
        System.out.printf("\nEnter the 18 grade:");
        grade18 = inputGrade.nextShort();
    }   //end of method getGrades
}  

