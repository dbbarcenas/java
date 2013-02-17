
package lettergrade;
import java.util.Scanner;
public class LetterGrade {
    
    /* This program will allow a user to enter % grade and will return
     * the letter grade to the screen
     */

    public static void main(String[] args)
    {
        int percentGrade; // this will be the person's % grade in a course
        Scanner input = new Scanner( System.in);
        
        System.out.printf("\nEnter your test score:");
        percentGrade = input.nextInt();
        
        //Determine the grade 
        if (percentGrade <50)
            System.out.printf("\nYour grade is F");
                    else if (percentGrade < 60)
                         System.out.printf("\nYour grade is D");
                                 else if (percentGrade < 70)
                         System.out.printf("\nYour grade is C");
                                 else if (percentGrade < 80)
                         System.out.printf("\nYour grade is B");
                                 else 
                         System.out.printf("\nYour grade is A");
    }
  
}
