package Methodspackagesconstructor;

public class Methodoverloading 
{
int x,y,z;
double d;

void sum()
{
x=10;
y=20;
System.out.println(x+y);
}
void sum(int a, int b)
{
x=a;
y=b;
System.out.println(x+y);
}

void sum(int a, double b)
{
x=a;
d=b;
System.out.println(x+d);
}

void sum(double b, int a)
{
x=a;
d=b;
System.out.println(x+d);
}

public static void main(String args[])
{
Methodoverloading mo = new Methodoverloading();
mo.sum();
mo.sum(100, 340);
mo.sum(23.46, 480);
mo.sum(243, 23.76);

}
	
	
	
	
	
	
	
	
	

}
