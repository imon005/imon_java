import java.util.Scanner;

class AgeException extends Exception
{
	AgeException(String message)
	{
		System.out.println(message);
	}
}

class UDFException
{
	public static void main(String[] args)
	{
		int age;

		try(Scanner sc = new Scanner(System.in);)
		{		
			System.out.print("Enter your age: ");
			age = sc.nextInt();

			if(age < 18)
				throw new AgeException("Not eligible to give vote");
			else
				System.out.println("Eligible to give vote");
		}
		catch(AgeException e)
		{
			e.printStackTrace();
		}
		/*finally
		{
			sc.close();
		}*/
	}
}

/*
Output:
------
Enter your age: 12
Not eligible to give vote
AgeException
        at UDFException.main(UDFException.java:23)

*/