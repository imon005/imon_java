import java.util.Scanner;

class NumberFormat
{
	public static void main(String[] args)
	{
		String s;
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string: ");
		s = sc.next();

		try
		{
			a = Integer.parseInt(s);
			System.out.printf("s = %d",a);
		}
		catch( NumberFormatException e)
		{
			System.out.println(e.getMessage()+"\nCan't convert to Integer");
		}
		finally
		{
			sc.close();
		}
	}
}

/*
Output:
------
Enter the string: 12f
For input string: "12f"
Can't convert to Integer

*/