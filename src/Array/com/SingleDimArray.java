 package Array.com;

import java.util.Arrays;

public class SingleDimArray 
{

	public static void main(String[] args) 
	{
		int a[] = {100,200,300,400,500,599,5908};
		//Size/length of an array
		System.out.println(a.length);
		//get a single value from an array
		System.out.println(a[2]);
		//get all the values from array
		System.out.println(Arrays.toString(a));

		//get all the values by using loop

				for(int i=0; i<7; i++)
	{			System.out.println(a[i]);
		}
		//	OR

		for(int i=0; i<=6; i++)
		{
			System.out.println(a[i]);
		}	
		//	if we don't the know the length of the array data list
		for(int i =0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

		//	Read data from array using enhanced for loop
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
