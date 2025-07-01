//Ass1-Q5
import java.util.Scanner;

class StringDisplay
{
	static void display(int n, String str)
	{
		for(int i=0;i<n;i++)
			System.out.println(str);
	}
	
	public static void main(String[] args)
	{
		
		Scanner  sc = new Scanner(System.in);

		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		System.out.print("Enter the no. of times: ");
		int n = sc.nextInt();

		display(n,str);
		sc.close();
	}
}		