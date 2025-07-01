import java.util.Scanner;



class ArrayIndexOutOfBounds

{

	public static void main(String[] args)

	{

		int idx;

		int[] arr = {25, 89, 3 ,-8, -45, 4};

		Scanner sc = new Scanner(System.in);



		System.out.print("Enter the index: ");

		idx = sc.nextInt();



		try

		{

			System.out.printf("arr[%d] = %d",idx,arr[idx]);

		}

		catch(ArrayIndexOutOfBoundsException e)

		{

			e.printStackTrace();

		}

		finally

		{

			sc.close();

		}

	}

}



/*

Output:

------

Enter the index: 12

java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 6

        at ArrayIndexOutOfBounds.main(ArrayIndexOutOfBounds.java:16)



*/
