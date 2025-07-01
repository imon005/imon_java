class Box
{
	double height, width, depth;

	void setData(double height, double width, double depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	void setData(double dim)
	{
		this.height = this.width = this.depth = dim;
	}

	double volume()
	{
		return(this.height*this.width*this.depth);
	}

}

class BoxMain
{
	public static void main(String[] args)
	{
	Box box1 = new Box();
	box1.setData(2,3,5);

	Box box2 = new Box();
	box2.setData(5);

	System.out.println("Volume of first box "+box1.volume());
	System.out.println("Volume of second box "+box2.volume());

	if(box1.volume() > box2.volume())
		System.out.println("box1 is bigger than box2");
	else if(box1.volume() < box2.volume())
		System.out.println("box2 is bigger than box1");
	else
		System.out.println("Same volume boxes");
	}
}	