package Inheritance;

class C
{
int a;
void showing()
{
System.out.println(a);
}
}
class D extends C
{
char e;
void run()
{
System.out.println(e);
}
}

class G extends D   //Multilevel and G is the child of D
{
String k;
void print()
{
System.out.println(k);
}
}


public class Inheritancetype 
{

	public static void main(String[] args) 
	{
//	D objd = new D();
//	objd.a = 1000;
//	objd.e = 'A';
//	objd.showing();
//	objd.run();
//	
	G objg = new G();   //Here this program is multilevel program, G is the child of D and grandchild of C.
	objg.a = 1290;
	objg.e = 'E';
	objg.k = "Prince Gaurav";
	objg.showing();
	objg.run();
	objg.print();
	

	}

}
