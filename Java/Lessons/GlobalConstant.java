//This is a program to illustrate the use of a global constant.  It is the java implementation of program 3-12 from the book.
import java.util.Scanner;	//import the Scanner class so we can get user input from the keyboard

public class GlobalConstant
{
	public static final double CONTRIBUTION_RATE = 0.5;
	
	public static void main(String[] args)
	{
		double annualGrossPay;		//declare a double to store someones annual gross pay and decimals
		double totalBonuses;		//declare a double to store the total bonus
		
		annualGrossPay = getGrossPay();	//Get the annual gross pay
		
		totalBonuses = getBonuses();	//call the method getBonuses which will prompt the user for the total bonus
		 
		showGrossPayContribution(annualGrossPay);	//display the retirement contribution for the Gross Income Earned
		
		showBonusContribution(totalBonuses);		//display the retirement contribution for all of the bonus income
		
	}	//end of main method
	
	
	//The getGrossPay method will prompt the user for the gross pay and return that to the calling function
	public static double getGrossPay()
	{
		Scanner input = new Scanner( System.in );
		System.out.printf("\n\nEnter the total gross pay.");
		return input.nextDouble(); 	// read the input from the keyboard		 
	}	//end of method getGrossPay
	
	
	//The getBonuses method will prompt the user for the bonuses earned in 1 year and return that to the calling function
	public static double getBonuses()
	{
		Scanner input = new Scanner( System.in );
		System.out.printf("\n\nEnter the total bonuses paid.");
		return input.nextDouble(); 	// read the input from the keyboard		 
	}	//end of method getBonuses
	
	
	//The showGrossPayContribution method takes the annual gross pay as an input and uses the global 
	//constant CONTRIBUTION RATE to calculate the contribution
	public static void showGrossPayContribution ( double totalPay)
	{
		double contribution;	//declare a variable to store the contribution amount
		contribution = totalPay * CONTRIBUTION_RATE;
		System.out.printf("\n\nThe contribution for the gross pay is:  $%.2f", contribution);
	}	//end of method showGrossPayContribution
	
	//The showBonusContribution method takes the annual gross pay as an input and uses the global 
	//constant CONTRIBUTION RATE to calculate the contribution
	public static void showBonusContribution ( double totalBonus )
	{
		double contribution;	//declare a variable to store the contribution amount
		contribution = totalBonus * CONTRIBUTION_RATE;
		System.out.printf("\n\nThe contribution for the bonus pay is:  $%.2f", contribution);
	}	//end of method showBonusContribution
	
}	//end of class GlobalConstant