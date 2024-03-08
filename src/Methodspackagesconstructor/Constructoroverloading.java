package Methodspackagesconstructor;

public class Constructoroverloading 
{
int x,y,z;
double d;
Constructoroverloading () //1st method
{
x=10;
y=20;
}
Constructoroverloading (int a, int b) //2nd method
{
x=a;
y=b;
}
Constructoroverloading (int a, double b) //3rd method
{
x=a;
d=b;
}
Constructoroverloading (double b,int a) //4th method
{
x=a;
d=b;
}

void display()
{
System.out.println(x);
System.out.println(y);
System.out.println(z);
System.out.println(d);
}
public static void main(String args[])
{
	Constructoroverloading co = new Constructoroverloading(10,119.2);
	co.display();
}
}
