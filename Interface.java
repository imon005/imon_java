


interface A

{

	void methA();

}



/*

class B implements A

{

	void methB()

	{

		System.out.println("Inside class B");

	}

}



class Ass7Q1

{

	public static void main(String[] args)

	{

		B ob = new B();

		ob.methB();

	}

}



C:\Users\STUDENT\Desktop\Soumyadeep_Adak>javac Ass7Q1.java

Ass7Q1.java:8: error: B is not abstract and does not override abstract method methA() in A

class B implements A

^

1 error

*/



abstract class B implements A

{

	abstract public void methA(); //Optional



	void methB()

	{

		System.out.println("Inside class B");

	}

}



class C implements A

{

	public void methA()

	{

		System.out.println("Abstract method of class A is implemented");

	}

}



class Ass7Q1

{

	public static void main(String[] args)

	{

		C ob = new C();

		ob.methA();

	}

}



/*

C:\Users\STUDENT\Desktop\Soumyadeep_Adak>javac Ass7Q1.java



C:\Users\STUDENT\Desktop\Soumyadeep_Adak>java Ass7Q1

Abstract method of class A is implemented

*/
