/*This is a simple class to show how a byte(8 bits) will
	overflow once it reaches 127*/
public class Overflow
{
	static public void main(String[] args)
	{
		for (byte counter = 1; counter> 0; counter++)
		{
			System.out.printf("\n%d", counter);
		}	//end of for loop
	
	} //end of main method

} //end of class Overflow