class Static1
{
	static int a = 3, b;
	
	static void meth(int x)
	{
		System.out.println(x+"\n"+a+"\n"+b);
	}

	static
	{
		System.out.println("Static Block");
		b = a*4;
	}

	public static void main(String[] args)
	{
		meth(4);
	}
}

/*
Static Block
4
3
12
*/