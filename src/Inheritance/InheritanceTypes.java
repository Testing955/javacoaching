package Inheritance;

class A
{
	int a=100; //here we create the variable and now if we want to print this then we've to create the method

	void display() //here we create the method
	{
		System.out.println(a);
	}
}

class b extends A //here we want a data of class a that's why we use extends key word 
{
	int b=100;  //here we create the variable and now if we want to print this then we've to create the method

	void show()//here we create the method 
	{
		System.out.println(b);
		System.out.println(a);
	}
}
	//and now if we want to print this method then e have to create the object inside the main class
	public class InheritanceTypes {

		public static void main(String[] args) 
		{
			b bobj = new b();  //here we create the object inside the main method without object we can't run any code

			
				System.out.println(bobj.a);
				System.out.println(bobj.b);
				bobj.display();
				bobj.show();
			

		}
	
}

		

	
