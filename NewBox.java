/*WAP to print the volume of box with different dimension.
You have to overload the constructor of box class.*/

class NewBox
{
	double height, width, depth;

	NewBox()
	{
		height =  2;
		width = 3.2;
		depth = 5.32;
	}

	NewBox(double dim)
	{
		height = width = depth = dim;
	}

	NewBox(double h, double w)
	{
		height = h;
		width = w;
		depth = 5.2;
	}

	NewBox(double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	}

	NewBox(NewBox ob)
	{
		height = ob.height;
		width = ob.width;
		depth = ob.depth;
	}

	double volume()
	{
		return height*width*depth;
	}

	static public void main(String... TS)
	{
		NewBox box1= new NewBox();
		System.out.println(box1.volume());

		NewBox box2= new NewBox(5);
		System.out.println(box2.volume());

		NewBox box3= new NewBox(5,6.5);
		System.out.println(box3.volume());

		NewBox box4= new NewBox(5,2.5,8.0);
		System.out.println(box4.volume());

		NewBox sp = new NewBox(box1);
		System.out.println(sp.volume());

	}
}

/*
34.048
125.0
169.0
100.0
34.048

*/	