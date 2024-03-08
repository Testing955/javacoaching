package Inheritance;

public class ABCXYZ extends DBC implements ABC,XYZ
{
public void m2() {
	System.out.println("This is an implementation of XYZ");
		System.out.println(b);
	}

public void m1() {
	System.out.println("This is an implementation of ABC");		
	System.out.println(a);
	}
public void m3() {
System.out.println("This is an implementation of DBC");		
System.out.println(c);
	}
public static void main(String args[])
{
ABCXYZ abcxyz = new ABCXYZ();
abcxyz.m1();
abcxyz.m2();
abcxyz.m3();
}
}

