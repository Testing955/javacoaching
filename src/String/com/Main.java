package String.com;

public class Main {

	public static void main(String[] args) {
		String name = "Prince Gaurav";
		System.out.println(name);
		System.out.println(name.length());

		String modifyname = new String ("Aashna");
		System.out.println(modifyname);
		System.out.println(modifyname.length());


		String s1 = "Welcome ";
		String s2 = "to java ";
		String s3= "Automation";
		System.out.println(s1 +s2);
		System.out.println(s1.concat(s2).concat(s3));
		s1 = "  Udemy  ";
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		s1="Welcome";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(5));
		s1="  Welcome to java ";
		System.out.println(s1.length());
		System.out.println(s1.stripLeading());
		s1 = "Prince Gaurav";
		System.out.println(s1.contains("Pri"));
		System.out.println(s1.contains("Ojha"));
		s1 = "Prince";
		s2 = "prince ojha";
		s3 = "Prince Ojha";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s2) || s1.equals(s3) || s2.equals(s3));
		System.out.println(s3.equalsIgnoreCase(s2));

		s1="My name is Prince Gaurav";
		System.out.println(s1.replace("Gaurav", "Ojha"));

		s1="Prince Ojha Aashna";
		System.out.println(s1.substring(0, 9));
		System.out.println(s1.substring(0, 18));
		System.out.println(s1.length());
//System.out.println(s1.stripLeading());

s1 ="prince.princeojha@gmail.com";
String a[]=s1.split("@");
System.out.println(a[0]);
System.out.println(a[1]);

s1="RAHUL@prince";
String b[]=s1.split("@");
System.out.println(b[0] +" "+ s1.toLowerCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());

String s5= new String ("Welcome");
String s4= new String("Welcome");
System.out.println(s5==s4);
System.out.println(s5.equals(s4));

String s6 = new String("welcom");
String s7 = new String("abc");
String s8 = s7;
System.out.println(s6==s7);
System.out.println(s6.equals(s7));
System.out.println(s8.equals(s7));
System.out.println(s8==s7);












	}

}
