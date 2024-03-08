package Methodspackagesconstructor;

public class Parameterizedconstructor 
{
	int x,y;
	String s;
	char a;
Parameterizedconstructor(int a, int b, String str, char d) //parameterized constructor
{
	x=a;
	y = b;
	s = str;
	this.a = d;  //this.a = d; // Use "this" to refer to the instance variable
}
	void output()
	{
	System.out.println(x);
	System.out.println(y);
	System.out.println(s);
	System.out.println(a);
	}



	public static void main(String[] args) 
	{
		Parameterizedconstructor cost = new Parameterizedconstructor(10,20,"Prince Gaurav",'c');
		 cost.output();
	}

}
