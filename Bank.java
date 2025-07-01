import java.util.Scanner;



class Account

{

	String acc_number, acc_holder;

	double balance;

	char type;



	Account()

	{

		acc_number = "";

		acc_holder = "";

		balance = 0.0;

		type = 'x';

	}



	Account(String acc, String name)

	{

		acc_number = acc;

		acc_holder = name;

		balance = 1000.0;

	}



	void deposit(double amount)

	{

		balance += amount;

		System.out.println("Rs. "+amount+" deposited successfully");

		System.out.println("New balance = "+balance);

	}



	void withdraw(double amount)

	{

	}



	void display()

	{

		System.out.println("Account number: "+acc_number);

		System.out.println("Account holder: "+acc_holder);

		System.out.println("Balance: "+balance); 

		System.out.println("Account type: "+type);

	}



	void addInterest()

	{

	}

}



class Savings extends Account //minimum balance Rs. 1000

{

	double interest;



	Savings(String acc, String name)

	{

		super(acc,name);

		type = 's';

	}

	

	void addInterest()

	{

		if(balance >= 10000.0)

		{

			interest = balance*.05;

			balance += interest; //5% interest if balance exceeds Rs. 10000.00

			System.out.println("5% interest credited...");

			System.out.println("New balance = "+balance);

		}

	}





	void withdraw(double amount)

	{

		if(balance-amount < 1000.0)

		{

			System.out.println("Minimum balance Rs. 1000");

			System.out.println("Withdrawal unsuccessful");

			System.out.println("Balance = "+balance);

		}

		else

		{

			balance -= amount;

			System.out.println("Rs. "+amount+" withdrawn successfully");

			System.out.println("New balance = "+balance);

		}

	}

}



class Current extends Account //Overdraft facility available

{

	double overdraftlimit = -1000.0;

	

	Current(String acc, String name)

	{

		super(acc,name);

		type = 'c';

	}



	void withdraw(double amount)

	{

		if(balance-amount >= overdraftlimit)

		{

			balance -= amount;

			System.out.println("Rs. "+amount+" withdrawn successfully");

			System.out.println("New balance = "+balance);

		}

		else

		{

			System.out.println("Withdrawal not possible");

			System.out.println("Balance = "+balance);

		}

	}

}



public class BankMain

{

	public static void main(String[] args)

	{

	int choice;

	double amount;

	Account acc = new Account();

	String accno, accname;

	char acctyp;

	Scanner sc = new Scanner(System.in);



	do

	{

		System.out.println("1. Create account\n2. Deposit\n3. Display\n4. Withdraw\n5. Exit");

		System.out.println("Enter your choice: ");

		choice = sc.nextInt();



		switch(choice)

		{

			case 1:

				System.out.print("Enter Account number: ");

				accno = sc.next();

				System.out.print("Enter Account holder name: ");

				sc.nextLine();

				accname = sc.nextLine();

				System.out.print("Enter Account type (Savings-'s',Current-'c'): ");

				acctyp = sc.nextLine().charAt(0); //For savings 's', For current 'c'

				if(acctyp == 's')

					acc = new Savings(accno,accname);

				else if(acctyp == 'c')

					acc = new Current(accno,accname);

				System.out.println("Account created successfully");

				acc.display();

				break;

			case 2:

				System.out.print("Enter amount to be deposited: ");

				amount = sc.nextDouble();

				acc.deposit(amount);

				if(acc.type == 's')

					acc.addInterest();

				break;

			case 3:

				acc.display();

				break;

			case 4:

				System.out.print("Enter amount to be withdrawn: ");

				amount = sc.nextDouble();

				acc.withdraw(amount);

				break;

		}



	}while(choice != 5);

	}

}
