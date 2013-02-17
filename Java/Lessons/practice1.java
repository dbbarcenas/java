import java.util.Scanner;

public class practice1
{
	public static void main(String[] args)
	{
		int getTest1
		int getTest2
		int getTest3
		
		test1 = getTest1();
		test2 = getTest2();
		test3 = getTest3();
		
		showTest1(test1);
		showTest2(test2);
		showTest3(test3);
		
	} // end of main method
	
	public static int getTest1()
	{
		Scanner input = new Scanner (System.in);
		System.out.printf("\n\nEnter Test 1:");
		return input.nextDouble();
	}	// end of method test1
	
	public static int getTest2()
	{
		Scanner input = new Scanner (System.in);
		System.out.printf("\n\nEnter Test 2:");
		return input.nextDouble();
	}	// end of method test2 

	public static int getTest3()
	{
		Scanner input = new Scanner (System.in);
		System.out.printf("\n\nEnter Test 3:");
		return input.nextDouble();
	}	// end of method test3
	
	public static void average(int average)
	{
		double average;
		average = (test1 + test2 + test3) / 3; 
		System.out.printf("\n\nThe average of the tests : %.2f", average);
	}

} //end of class