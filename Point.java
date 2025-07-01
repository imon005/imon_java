class Point
{
	double x, y;

	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	static double distance(Point a, Point b)
	{
		return (Math.sqrt(Math.pow(a.x-b.x,2) + Math.pow(a.y-b.y,2)));
	}

	public static void main(String[] args)
	{
		Point point1 = new Point(3,2);
		Point point2 = new Point(2,3);

		System.out.printf("Distance = %.2f",distance(point1,point2));
	}
}

/*
Distance = 1.41
*/