class Bank_Account
{
	String Account_holder_Name, Account_Number;
	char Account_Type;
 	double balance;

	public Bank_Account(String ahname, String ahnum, char actype)
	{
		Account_holder_Name = ahname;
		Account_Number = ahnum;
		Account_Type = actype;
	}

	public void withdraw_money(double amount)
	{
		if(balance<=2000 || amount>balance)
			System.out.println("Withdrawal not possible");
		else if(amount<=balance)
		{
			System.out.println("Withdrawal successful");
			balance -= amount;
		}
		
		System.out.println("Current Balance = "+balance);
	}

	public void deposit_money(double amount)
	{
		balance += amount;
		System.out.println("Deposition successful");
		System.out.println("Current Balance = "+balance);
	}
}

class Bank_Account_Main
{
	public static void main(String... TS)
	{
		Bank_Account ob = new Bank_Account("Ram Das","STCET001",'S');

		System.out.println("Account Holder name: "+ob.Account_holder_Name+
		"\nAccount number: "+ob.Account_Number+"\nAccount type: "+ob.Account_Type);

		ob.deposit_money(5000);
		ob.withdraw_money(2000);
	}
}
		