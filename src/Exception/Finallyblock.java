package Exception;

public class Finallyblock 
{

	public static void main(String[] args) 
	{
System.out.println("Program is started");
String t = null;
//String s = "Welcome";
try
{
//System.out.println(100/s);  //1st case finaly block
System.out.println(t.length());  // 3rd case fially block
System.out.println("Extra line");
}
//catch(ArithmeticException e)
catch(Exception e)
{
System.out.println("It's catch statement");
}

finally
{
System.out.println("it's finally statement");
}
System.out.println("Program is ended");
	}

}
