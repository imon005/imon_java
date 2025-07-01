/*WAP to demonstrate Object  as a return type*/

class Incrementer
{
	int a;

	Incrementer(int i)
	{
		a = i;
	}

	Incrementer incbyten()
	{
		Incrementer temp = new Incrementer(a+10);
		return temp;
	}

	
	public static void main(String... args)
	{
		Incrementer ob = new Incrementer(2);
		System.out.println(ob.a);

		//System.out.println(ob.incbyten().a);

		Incrementer ob1 = ob.incbyten();
		System.out.println(ob1.a);

		ob1 = ob1.incbyten();
		System.out.println(ob1.a);		
	}
}

/*
2
12
22
*/		