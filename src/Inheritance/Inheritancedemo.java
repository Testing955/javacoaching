package Inheritance;

interface Shape
{
int length = 10;  //final & static
int width= 20;    //final & static

//now going to create the abstract method
void circle();

default void square()  //this is default method
{
System.out.println("This square is a default method");
}
static void rectangle()  //this is static method
{
System.out.println("The rectangle is a static method");
}
}







public class Inheritancedemo implements Shape
{
public void circle()
{
System.out.println("This is a circle");
}
	
public static void main(String[] args) 
	{

	 Inheritancedemo idobj = new  Inheritancedemo();
	 idobj.circle();
	 idobj.square();
	 Shape.rectangle();  //Static method can directly access
	 
	 //shape sh = new shape();
	 Shape sh = new Inheritancedemo();
	 sh.circle();
	 sh.square();
	 
	 
	 
	}

}
