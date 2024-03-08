package Methodspackagesconstructor;

public class Thiskeywordconstructor 
{
int x,y;
Thiskeywordconstructor(int x,int y)
{
this.x=x;
this.y=y;
}
void display()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String args[])
{
Thiskeywordconstructor th = new Thiskeywordconstructor(10,20);
th.display();
}
}
