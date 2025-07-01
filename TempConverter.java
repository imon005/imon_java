//Ass1_Q6
import java.util.Scanner;

class TempConverter
{
	static double converter(double f)
	{
		return ((f-32.0)/9.0*5.0);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Fahrenheit: ");
		double F = sc.nextDouble();

		System.out.printf("Celsius = %.2f",converter(F));

		sc.close();
	}
}