import java.util.Scanner;

public class LetterGrade
{
	public static void main(String[] args)
	{
		int score;
		Scanner input = new Scanner( System.in );
		
		System.out.printf("\n\nEnter your test score:  ");
		score = input.nextInt();
		
		//Determine the grade
		if (score < 50)
			System.out.printf("\nYour grade is F");
		else if (score < 60)
			System.out.printf("\nYour grade is D");
		else if (score < 70)
			System.out.printf("\nYour grade is C");
		else if (score < 80)
			System.out.printf("\nYour grade is B");
		else if (score < 90)
			System.out.printf("\nYour grade is A");
		else 
			System.out.printf("\nYour grade is A+");
	}	//end of method main
}	//end of class LetterGrade


