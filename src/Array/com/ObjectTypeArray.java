package Array.com;

public class ObjectTypeArray {

	public static void main(String[] args) {
		Object a[] = new Object[6];
		a[0]= 10;
		a[1]= "Prince Gaurav";
		a[2]= 'A';
		a[3]= 10.23;
		a[4]= 1234543l;
		a[5]= true;

		for(int i =0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

		//Enhanced type
		for(Object y:a)
		{
			System.out.println(y);
		}
	}

}
