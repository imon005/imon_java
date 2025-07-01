import java.util.Scanner;

class ClassRoom
{
	double length, breadth;

	ClassRoom(double l, double b)
	{
		length = l;
		breadth = b;
	}

	double calc_area()
	{
		return (this.length*this.breadth);
	}
}

class BedRoom extends ClassRoom
{
	int attached_bathroom, study_table, night_lamp;

	BedRoom(double l, double b, int f1, int f2, int f3)
	{
		super(l,b);
		attached_bathroom = f1;
		study_table = f2;
		night_lamp = f3;
	}

	double calc_area()
	{
		return (super.calc_area());
	}

	void features()
	{
		System.out.println("Number of attached bathroom = "+attached_bathroom);
		System.out.println("Number of study table = "+study_table);
		System.out.println("Number of night lamp = "+night_lamp);
	}
}

class DrawingRoom extends ClassRoom
{
	int sofa, wallcabinet;

	DrawingRoom(double l, double b, int f1, int f2)
	{
		super(l,b);
		sofa = f1;
		wallcabinet = f2;
	}

	double calc_area()
	{
		return (super.calc_area());
	}

	void features()
	{
		System.out.println("Number of sofa = "+sofa);
		System.out.println("Number of wallcabinet = "+wallcabinet);
	}
}

public class RoomMain
{
	public static void main(String[] args)
	{
		int f1, f2, f3;
		double len, bed;
		Scanner sc = new Scanner(System.in);
		
		//ClassRoom
		System.out.println("Enter Classroom details:");
		System.out.print("Enter length: ");
		len = sc.nextDouble();
		System.out.print("Enter breadth: ");
		bed = sc.nextDouble();
		ClassRoom cr = new ClassRoom(len,bed);
		System.out.print("Classroom area:");
		System.out.println(cr.calc_area());

		//BedRoom
		System.out.println("Enter Bedroom details:");
		System.out.print("Enter length: ");
		len = sc.nextDouble();
		System.out.print("Enter breadth: ");
		bed = sc.nextDouble();
		System.out.print("Enter number of attached bathroom: ");
		f1 = sc.nextInt();
		System.out.print("Enter number of study table: ");
		f2 = sc.nextInt();
		System.out.print("Enter number of night lamp: ");
		f3 = sc.nextInt();
		BedRoom br = new BedRoom(len,bed,f1,f2,f3);
		System.out.print("Bedroom area:");
		System.out.println(br.calc_area());
		System.out.println("Bedroom features:");
		br.features();

		//DrawingRoom
		System.out.println("Enter Drawingroom details:");
		System.out.print("Enter length: ");
		len = sc.nextDouble();
		System.out.print("Enter breadth: ");
		bed = sc.nextDouble();
		System.out.print("Enter number of sofa: ");
		f1 = sc.nextInt();
		System.out.print("Enter number wallcabinet: ");
		f2 = sc.nextInt();
		DrawingRoom dr = new DrawingRoom(len,bed,f1,f2);
		System.out.print("Drawingroom area:");
		System.out.println(dr.calc_area());
		System.out.println("Drawingroom features:");
		dr.features();

		sc.close();
	}
}

/*
Output:
------
C:\Users\STUDENT\Desktop\Soumyadeep_Adak>javac RoomMain.java

C:\Users\STUDENT\Desktop\Soumyadeep_Adak>java RoomMain
Enter Classroom details:
Enter length: 2
Enter breadth: 3
Classroom area:6.0
Enter Bedroom details:
Enter length: 3
Enter breadth: 5
Enter number of attached bathroom: 5
Enter number of study table: 6
Enter number of night lamp: 3
Bedroom area:15.0
Bedroom features:
Number of attached bathroom = 5
Number of study table = 6
Number of night lamp = 3
Enter Drawingroom details:
Enter length: 6
Enter breadth: 5
Enter number of sofa: 9
Enter number wallcabinet: 1
Drawingroom area:30.0
Drawingroom features:
Number of sofa = 9
Number of wallcabinet = 1
*/