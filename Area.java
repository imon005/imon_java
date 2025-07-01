/*WAP to print the area of circle, rectangle and square. You have to overload area method.*/



class Area

{

	double area(int radius)

	{

		return Math.PI*Math.pow(radius,2);

	}



	double area(double side)

	{

		return Math.pow(side,2);	

	}



	double area(double height, double width)

	{

		return height*width;

	}



	public static void main(String[]  args)

	{

		Area ob = new Area();



		System.out.println("Area of circle = "+ob.area(7));



		System.out.println("Area of square = "+ob.area(5.0));



		System.out.println("Area of rectangle = "+ob.area(5,6.2));

	}

} 



/*

Area of circle = 153.93804002589985

Area of square = 25.0

Area of rectangle = 31.0

*/
