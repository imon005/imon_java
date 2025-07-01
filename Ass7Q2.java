//Assignment 7 Q2

interface X
{
	void meth();
}

interface Y
{
	void meth();
}

class Z implements X, Y
{
	public void meth()
	{
		System.out.println("Inside class Z");
	}
}

class Ass7Q2
{
	public static void main(String[] args)
	{
		Z ob = new Z();
		ob.meth();
	}
}

/*
C:\Users\STUDENT\Desktop\Soumyadeep_Adak>javac Ass7Q2.java

C:\Users\STUDENT\Desktop\Soumyadeep_Adak>java Ass7Q2
Inside class Z
*/