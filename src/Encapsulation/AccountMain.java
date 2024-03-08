package Encapsulation;

public class AccountMain {

	public static void main(String[] args) 
	{
		Account accobj = new Account();
		accobj.setacc_no(123456543);
		accobj.setname("Prince Gaurav");
		accobj.setamount(123432);
		accobj.setsname('a');
		System.out.println(accobj.getacc_no());
		System.out.println(accobj.getamount());
		System.out.println(accobj.getname());
		System.out.println(accobj.getsname());

	}

}
