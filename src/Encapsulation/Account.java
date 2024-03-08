package Encapsulation;

public class Account 
{
	private int acc_no;
	private String name;
	private double amount;
	private char sname;
	public int getacc_no()
	{
		return acc_no;
	}
	public void setacc_no(int acc_no)
	{
		this.acc_no = acc_no;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public double getamount()
	{
		return amount;
	}
	public void setamount(double amount)
	{
		this.amount = amount;
	}
	public char getsname()
	{
		return sname;
	}
	public void setsname(char sname)
	{
		this.sname = sname;
	}
}

