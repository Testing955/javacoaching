package Exception;

public class Checkedstatementdemo 
{
public static void main(String args[]) throws InterruptedException
{
System.out.println("Program is started");
System.out.println("Program is in progress");
/*try 
{
	Thread.sleep(5000);
} 
catch (InterruptedException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/
Thread.sleep(5000);
System.out.println("Program is executed");
System.out.println("Program is finished");
}
}

