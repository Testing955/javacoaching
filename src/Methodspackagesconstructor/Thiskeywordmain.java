package Methodspackagesconstructor;

public class Thiskeywordmain {

	int x,y;
	void donkeyword(int x, int y)
	{
	this.x=x;
	this.y=y;
	}
	void display()
	{
	System.out.println(x);
	System.out.println(y);
	}

	public static void main(String[] args)
	{
Thiskeywordmain th = new Thiskeywordmain();
th.donkeyword(10,20);
th.display();


	}

}
