//This is a program to show the difference between local and global variable
public class ScopeofVariables
{
	public static int globalVariable = 20;
	
	public static void main(String[] args)
	{
		int localVariable = 10;
	
		System.out.printf("\n\nFROM-MAIN-The value of the globalVariable is %d",globalVariable);
		System.out.printf("\n\nFROM-MAIN-The value of the localVariable is %d",localVariable);
		showMessage();
		System.out.printf("\n\nFROM-MAIN-The value of the globalVariable is %d",globalVariable);
		System.out.printf("\n\nFROM-MAIN-The value of the localVariable is %d",localVariable);
		
	} // end of main method
	
	public static void showMessage()
	
	{
		int localVariable = 20;
		globalVariable = 100;
		System.out.printf("\n\nThe value of the globalVariable is %d",globalVariable);
		System.out.printf("\n\nThe value of the localVariable is %d",localVariable);
	}
	

}	//end of class SchopeofVariables