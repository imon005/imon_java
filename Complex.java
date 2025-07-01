class Complex
{
	double real, img;

	Complex(double real, double img)
	{
		this.real = real;
		this.img = img;
	}

	Complex()
	{
		this.real = 0.0;
		this.img = 0.0;
	}

	static void display(Complex num)
	{
		if(num.img >= 0.0)
			System.out.printf("Value = (%.2f + %.2fi)",num.real,num.img);
		else
			System.out.printf("Value = (%.2f - %.2fi)",num.real,Math.abs(num.img));
		System.out.println();
	}

	static Complex add(Complex num1, Complex num2)
	{
		Complex res = new Complex();
		res.real = num1.real + num2.real;
		res.img = num1.img + num2.img;
		return res;
	}

	static Complex sub(Complex num1, Complex num2)
	{
		Complex res = new Complex();
		res.real = num1.real - num2.real;
		res.img = num1.img - num2.img;
		return res;
	}

	static Complex mul(Complex num1, Complex num2)
	{
		Complex res = new Complex();
		res.real = num1.real * num2.real - num1.img * num2.img;
		res.img = num1.real * num2.img + num1.img * num2.real;
		return res;
	}

	static double modulus(Complex num)
	{
		return Math.sqrt(Math.pow(num.real,2)+Math.pow(num.img,2));
	}

	static Complex complement(Complex num)
	{
		Complex res = new Complex();
		res.real = num.real;
		res.img = -1.0*num.img;
		return res;
	}

	public static void main(String[] args)
	{
		Complex num1 = new Complex(2,3);
		Complex num2 = new Complex(3,-1);

		System.out.println("Number1:");
		display(num1);
		System.out.println("Number2:");
		display(num2);

		System.out.println("Addition:");
		display(add(num1,num2));

		System.out.println("Subtraction:");
		display(sub(num1,num2));

		System.out.println("Multiplication:");
		display(mul(num1,num2));

		System.out.println("Modulus of number1: "+modulus(num1));

		System.out.println("Complement of number1:");
		display(complement(num1));
	}
}

/*
Number1:
Value = (2.00 + 3.00i)
Number2:
Value = (3.00 - 1.00i)
Addition:
Value = (5.00 + 2.00i)
Subtraction:
Value = (-1.00 + 4.00i)
Multiplication:
Value = (9.00 + 7.00i)
Modulus of number1: 3.605551275463989
Complement of number1:
Value = (2.00 - 3.00i)

*/
