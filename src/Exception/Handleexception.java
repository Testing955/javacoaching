package Exception;
import java.util.Scanner;

public class Handleexception 
{

	public static void main(String[] args) 
	{
System.out.println("Program is started");
Scanner in = new Scanner(System.in);
System.out.println("Enter a number: ");
int a = in.nextInt();
try
{
System.out.println(36/a);
}
catch(ArithmeticException t)
{
//t.printStackTrace();
System.out.println(t.getMessage());
System.out.println("You've enterd a wrong value");
}
System.out.println("Program is completed......");
System.out.println("Program is executed.......");





	}

}
