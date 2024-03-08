package Encapsulation;

public class Staticexamples 
{
	static int a = 10; //Static variable ()
	int b = 20; // non static variable()

	static void m1()
	{
		System.out.println("This is static method program");
	}
	void m2()
	{
		System.out.println("This is not a static programs");
	}
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}



	public static void main(String[] args) 

	{
		Staticexamples  se = new Staticexamples ();
		System.out.println(se.b);
		se.m2();
		se.m();
		m1();
		System.out.println(a);




	}

}
