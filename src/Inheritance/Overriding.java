package Inheritance;

class computer
{
int price ()
{
return 1000;

//System.out.println(price);
}
}

class mobile extends computer
{
int price()
{
return 1200;
}
}

class tab extends computer
{
int price()
{
return 1320;
}
}




public class Overriding {

	public static void main(String[] args) {
computer objcom = new computer();
System.out.println(objcom.price());
mobile objmob = new mobile();
System.out.println(objmob.price());
tab objtab = new tab();
System.out.println(objtab.price());


	}

}



//class bank
//{
//int roi()
//{
//return 1000;
//}
//}
//
//class Icici extends bank
//{
//int roi()
//{
//return 1223;
//}
//
//}
//
//class sbi extends bank
//{
//int roi()
//{
//return 1532;
//}
//}
//public class Overriding
//{
//public static void main(String args [])
//{
//bank objbank = new bank();
//Icici objic = new Icici();
//sbi objsbi = new sbi();
//System.out.println(objbank.roi());
//System.out.println(objic.roi());
//System.out.println(objsbi.roi());
//
//
//}
//}