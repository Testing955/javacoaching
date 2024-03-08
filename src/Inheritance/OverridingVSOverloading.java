package Inheritance;

//class vba
//{
//void m1(int f)
//{
//System.out.println(f);
//}
//void m2(int y)
//{
//System.out.println(y);
//}
//}
//
//class fdg extends vba
//{
//void m1(int f)
//{
//System.out.println(f*f);
//}
//void m2(int y, int f)
//{
//System.out.println(y+f);
//}
//}
//
//public class Overridingoverloading {
//
//	public static void main(String[] args) 
//	{
//vba VBA = new vba();
//fdg FDG = new fdg();
//VBA.m1(100);
//FDG.m2(20);
//FDG.m2(210, 299);
//	}
//
//}


class Ram
{
void sita(int a)
{
System.out.println(a);
}
void laxman(char v)
{
System.out.println(v);
}
void satrughna(String p)
{
System.out.println(p);
}
void hanuman(double k)
{
System.out.println(k);
}
void bharat(int w)
{
System.out.println(w);
}
}
class Ramayan extends Ram
{
void sita(int a, int m)   //here we change the definition of the method so it is overloading method
{
System.out.println(a+m);
}
void laxman(char v) 
{
System.out.println(v);
}
void satrughna(String p, String i)
{
System.out.println(p+" " +i);
}
void hanuman(double k)   //here we're not changing any definition of the method but we're changing the body of the method
{
System.out.println(k+k);  //body of the method is changing
}
void bharat(int w, int d)
{
System.out.println(w*d);
}
}
public class OverridingVSOverloading
{
public static void main(String args[])
{
Ram ram = new Ram();
Ramayan ramayan = new Ramayan();
ram.sita(20);
ram.bharat(880);
ram.hanuman(345.98);
ram.satrughna("Prince");
ram.laxman('y');
ramayan.bharat(908);
ramayan.hanuman(890.09);
ramayan.satrughna("Gaurav");
ramayan.sita(9809);
ramayan.sita(201, 8970);
ramayan.bharat(7876, 7);
ramayan.laxman('B');
ramayan.satrughna("Aashna", "Gaurav");
}
}
