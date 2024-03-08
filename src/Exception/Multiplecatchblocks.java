package Exception;
import java.util.Scanner;

public class Multiplecatchblocks 
{

	public static void main(String[] args) 
	{
System.out.println("Program is started");
Scanner in = new Scanner(System.in);
System.out.println("Enter a number: ");

/*try
{
System.out.println(s.length());   //null pointer exception
//System.out.println(100/a);      //Arithmetic exception
}
catch(ArithmeticException t)
{

System.out.println("Arithmetic exception");
}

catch(NullPointerException t)
{
System.out.println("Nullpointer exception");
}

catch(NumberFormatException t)
{
System.out.println("Numberformat exception");
}

System.out.println("Program is completed......");
System.out.println("Program is executed.......");*/
int a = in.nextInt();
//String s = null;
try
{
//System.out.println(s.length());   //null pointer exception
System.out.println(100/a);      //Arithmetic exception

}
catch(Exception t)
{
//t.printStackTrace();	
//System.out.println(t.getMessage());
System.out.println("Exception thrown");
}





	}

}
