
/*Pseudo Code   
Module main ()
	variable true and false 
	
CallDisplayLogicGates	"true,fals"
	display displayLogicGates 
CallDisplayLogicGates	"true,false"
	display displayLogicGates 
CallDisplayLogicGates	"true,false"
	display displayLogicGates 
display "NOT true = false"
display "NOT false = true
	
End Module

displayLogicGates Module (string statusone,string statustwo) 
	display "status1 AND status1 = status1"
	display "status1 OR status2 = status1"
End Module


*/

public class LogicLab
{
	public static void main(String[] args) 
	{
	boolean status1, status2; // true and false are being set as a variable 
	status1 = true;		// declare status1 as true
	status2 = false;	// declare status2 as false
	
	
		displayLogicGates(status1, status1); // the output of displayLogicGates when called
		displayLogicGates(status1, status2);	
        displayLogicGates(status2, status2);
        System.out.printf("\nNOT %s \t\t= \t%s", status1, !status1);	// 
        System.out.printf("\nNOT %s \t\t= \t%s", status2, !status2);
	}// end of the main method
	
	public static void displayLogicGates(boolean statusOne, boolean statusTwo)	// 
	{	
		System.out.printf("\n%s \tAND \t%s \t= \t%s", statusOne, statusTwo, statusOne && statusTwo); //Both these lines will be 
        System.out.printf("\n%s \tOR \t%s \t= \t%s", statusOne, statusTwo, statusOne || statusTwo);	// printed when displayLogicGates is called 
	}	// end of displayLogicGates Module															// to the main method
	
}	//end of class LogicLab

