/*WAP to print the addition value of different data
(e.g. int, float, double etc.)*/

class Addition
{
	int sum(int a, int b)
	{
		return a+b;
	}

	double sum(int a, float b)
	{
		return a+b;
	}

	double sum(double a, int b)
	{
		return a+b;
	}

	double sum(int a, double b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		Addition add = new Addition();

		System.out.println(add.sum(2,3));
		System.out.println(add.sum(2.5,3));
		System.out.println(add.sum(2,3.5f));
		System.out.println(add.sum(2,3.3));
	}
}

/*
5
5.5
5.5
5.3
*/
