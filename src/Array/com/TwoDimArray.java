package Array.com;

public class TwoDimArray {

	public static void main(String[] args) {
		// This approach when the list is fixed approach 1

		int a[][] = new int [3][2];
		/*	a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		System.out.println(a[0][1]); */

		//	Approach 2 when the list is not fixed
		int b [][]= {
				{100,200,500},
				{300,400,600},
				{400,500}
		};
		System.out.println(b[2][1]);

		//	length of array
		System.out.println(a.length);
		System.out.println(a[1].length);
		//	reading data from array using classic for loop
		for(int r = 0; r<b.length;r++)
		{
			for(int c = 0; c<b[r].length;c++)
			{
				System.out.print(b[r][c] + " ");
			}
			System.out.println();
		}
		//reading data from 2 d array using enhanced for loop

		for(int x []:b)

		{

			for(int v : x)

			{

				System.out.print(v + " ");

			}
			System.out.println();

		}
	}
}

