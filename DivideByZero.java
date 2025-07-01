import java.util.Scanner;

class DivideByZero
{
	public static void main(String[] args)
	{
		int op1, op2, res;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of dividend: ");
		op1 = sc.nextInt();
		System.out.print("Enter the value of divisor: ");
		op2 = sc.nextInt();

		try
		{
			res = op1/op2;
			System.out.println(op1+" / "+op2+" = "+res);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
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
Enter the value of dividend: 2
Enter the value of divisor: 0
java.lang.ArithmeticException: / by zero
        at DivideByZero.main(DivideByZero.java:17)

*/