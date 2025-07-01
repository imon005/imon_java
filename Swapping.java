/*WAP to demonstrate Object as a parameter*/

class Swapping
{
	int i, j;

	Swapping(int a, int b)
	{
		i = a;
		j = b;
	}

	void meth(Swapping ob)
	{
		ob.i = ob.i + ob.j;
		ob.j = ob.i - ob.j;
		ob.i = ob.i - ob.j;
	}

	public static void main(String args[])
	{
		Swapping ob = new Swapping(15,20);

		System.out.printf("Before swapping...\na = %d\nb = %d\n",ob.i,ob.j);

		ob.meth(ob); 

		System.out.printf("After swapping...\na = %d\nb = %d\n",ob.i,ob.j);		
	}
}

/*
Before swapping...
a = 15
b = 20
After swapping...
a = 20
b = 15
*/