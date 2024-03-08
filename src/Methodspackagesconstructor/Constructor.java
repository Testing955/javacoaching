package Methodspackagesconstructor;

public class Constructor 
{
	int x,y;
	String s;
	char a;
	Constructor() //Default Constructor
	{
x= 100;
y= 20;
s="Prince";
a = 'b';
	}
 void demo() //Creating method for getting the output
 {
	System.out.println(x);
	System.out.println(y);
	System.out.println(s);
	System.out.println(a);
 }

	public static void main(String[] args) 
	{
	Constructor display = new Constructor(); //Creating object for invoking the constructor
	display.demo();
	}

}
