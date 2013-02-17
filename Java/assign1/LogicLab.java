public class LogicLab
{
	public static void main(String[] args)
	{
		boolean status = !true;
	
		System.out.printf("TRUE \tAND \tTRUE \t= %s\n,"  (status && status));
		System.out.printf("TRUE \tOR \tTRUE \t= %s\n,"   (status || status));
		
		System.out.printf("TRUE	\tAND \tFALSE \t=%s\n,"  (status && status));
		System.out.printf("TRUE \tOR \tFALSE \t=%s\n,"   (status || status));
		
		System.out.printf("FALSE \tAND \tFALSE \t=%s\n," + (status && !status));
		System.out.printf("%s \tOR \t%s \t=%s\n,"  + (!status || !status));
		
		System.out.printf("NOT TRUE \t\t= %s\n,"  + status);
		System.out.printf("NOT FALSE \t\t= %s\n" + status);
	}
}	//end of class LogicLab


*/