class Outer
{
	int outer_x = 100;

	void test()
	{
		Inner ob = new Inner();
		ob.display();
	}

	class Inner
	{
		void display()
		{
			System.out.println(outer_x);
		}
	}

	public static void main(String... args)
	{
		Outer ob1 = new Outer();
		ob1.test();
	}
}

/*
100
*/