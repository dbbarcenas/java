public class LogicLab
{
	public static void main(String[] args){
		boolean status = !true;
		
		System.out.println("TRUE \tAND \tTRUE \t=\t " 	+ (status && status));
		System.out.println("TRUE \tOR \tTRUE \t=\t " 	+ (status || status));
		
		System.out.println("TRUE \tAND \tFALSE\t=\t " 	+ (status && !status));
		System.out.println("TRUE \tOR \tFALSE\t=\t " 	+ (status || !status));
		
		System.out.println("FALSE \tAND \tFALSE\t=\t " 	+ (status || status));
		System.out.println("FALSE \tOR \tFALSE\t=\t " 	+ (!status || !status));
		
		System.out.println("NOT TRUE \t\t= \t " 		+ status);
		System.out.println("NOT FALSE \t\t= \t " 		+ !status);
	}
}


