public class LogicLab
{
	public static void main(String[] args)
	{
	boolean status1 = true;
	boolean status2 = false;
	
	System.out.printf("\n%s \tAND \t%s \t= \t%s", status1, status1, status1 && status1);
	System.out.printf("\n%s \tOR \t%s \t= \t%s", status1, status1, status1 || status1);
	
	System.out.printf("\n%s \tAND \t%s \t= \t%s", status2, status1, status2 && status1);
	System.out.printf("\n%s \tOR \t%s \t= \t%s", status2, status1, status2 || status1);
	
	System.out.printf("\n%s \tAND \t%s \t= \t%s", status2, status2, status2 && status2);
	System.out.printf("\n%s \tOR \t%s \t= \t%s", status2, status2, status2 || status2);
	
	System.out.printf("\nNOT %s \t\t= \t%s", status1, status2);
	System.out.printf("\nNOT %s \t\t= \t%s", status2, status1);
	}
	
}	