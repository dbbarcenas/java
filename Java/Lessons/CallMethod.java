//This is a simple class to show how to use methods
//This reflects the pseudo code on page 84, figure 3-2
public class CallMethod
{
	public static void main (String[] args)
	{
		System.out.printf("\nI have a message for you");
		showMessage();
		System.out.printf("\nThat's all folks!");
	}	//end of main method
	
	
	public static void showMessage()
	{
		System.out.printf("\nHello World!  This is my first method call. :-) ");
	}	//end of method showMessage
}	//end of class CallMethod