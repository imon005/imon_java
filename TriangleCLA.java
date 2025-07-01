class TriangleCLA
{
	static void area_perimeter(int a, int b, int c)
	{
		double s=0.0f, ar=0.0f, p=0.0f;
		
		p=(a+b+c);
		s = (a+b+c)/2.0f;
		ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.printf("Area = %.2f\nPerimeter = %.2f",ar,p);
	}
	
	public static void main(String... TS)
	{
		double res;

		int side1 = Integer.parseInt(TS[0]);
		int side2 = Integer.parseInt(TS[1]);
		int side3 = Integer.parseInt(TS[2]);

		if(side1<=0 || side2<=0 || side3<=0)
			System.out.println("Length must be positive");
		else if(side1+side2<=side3 || side2+side3<=side1 || side3+side1<=side2)
			System.out.println("Sum of any two side lengths must be greater than 3rd one");
		else
			area_perimeter(side1,side2,side3);

	}
}
			