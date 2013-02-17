public class BankAccount
{
	private String pin;				//a private variable to hold the pin code
	private double balance; 		//a private variable to hold the balance
	private int    accountNumber;	//a private variable to hold the account number
	
	//Account constructor initializes the attributes
	public BankAccount (int accountNum, double initialBalance, String initialPin)
	{
		accountNumber = accountNum;
		balance = initialBalance;
		pin  = initialPin;
	}	//end of constructor
	
	//The following method is a set method for the pin
	public void setPin( String userPin )
	{
		pin = userPin;
	}	//end of setPin method
	
	//The following method is a set method for the account balance
	public void setBalance( double accountBalance)
	{
		balance = accountBalance;
	}	//end of the setBalance
	
	//The following method returns the users balance
	public double getBalance()
	{
		return balance;
	}	//end of getBalance method
	
	public boolean validUser(String pinEntered)
	{
		return pin == pinEntered;	//evaluate if the pin given matches the users pin, return whether it is true or false
	}	//end of method validUser
}	//end of class bankAccount