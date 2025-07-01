//Assignment 7 Q3

class X
{
	void meth()
	{
		System.out.println("Inside class X");
	}
}

class Y
{
	void meth()
	{
		System.out.println("Inside class Y");
	}
}

class Z extends X, Y
{
	void meth()
	{
		System.out.println("Inside class Z");
	}
}

class Ass7Q3
{
	public static void main(String[] args)
	{
		Z ob = new Z();
		ob.meth();
	}
}

/*
Ass7Q3.java:19: error: '{' expected
class Z extends X, Y
                 ^
1 error
*/