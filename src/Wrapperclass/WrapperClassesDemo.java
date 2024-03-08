package Wrapperclass;

public class WrapperClassesDemo 
{

	public static void main(String[] args) 
	{
//int a = 100;  //here a is a normal primitive variable hence we can't access any variable 
//System.out.println(a);
//Integer a = 100;  //here a is a Wrapper variable  hence we can access any variable
//System.out.println(a.intValue());

//here below the data is in primitive data type format		
byte b = 10;
char c = 'a';
String s = "Prince Gaurav";
int a = 90;
long l = 980900;
double d = 908.678;
float f = 7897.98809f;
boolean b2 = true;
short t = 80;

//Now we're converting the data in object type format
//converting primitive into object is: Autoboxing
//Here wrapperclass is the word which contain obj and also we assign the primitive data to them after equal to.

Byte byteobj = b;
Character charobj = c;
Integer intobj = a;
Long longobj = l;
Double doubleobj = d;
Float floatobj = f;
Boolean booleanobj = b2;
Short shortobj = t;

System.out.println("Byte object: " + byteobj);
System.out.println("Character object: " + charobj);
System.out.println("Integer object: " + intobj);
System.out.println("Long object: " + longobj);
System.out.println("Double object: " + doubleobj);
System.out.println("Float object: " + floatobj);
System.out.println("Boolean object: " + booleanobj);
System.out.println("Short object: " + shortobj);
//Note n Java, String is not considered a primitive data type; 
//it is an object data type. Primitive data types in Java include int, double, char, boolean, and others

//Converting object into primitive is called unboxing
 byte bytevalue = byteobj;
 char charvalue = charobj;
 int intvalue = intobj;
 long longvalue = longobj;
 double doublevalue = doubleobj;
 float floatvalue = floatobj;
 boolean booleanvalue = booleanobj;
 short  shortvalue = shortobj;
 
 System.out.println("bytevalue: " + byteobj);
 System.out.println("charvalue: " + charobj);
 System.out.println("intvalue: " + intobj);
 System.out.println("longvalue: " + longobj);
 System.out.println("doublevalue: " + doubleobj);
 System.out.println("floatvalue: " + floatobj);
 System.out.println("booleanvalue: " + booleanobj);
 System.out.println("shortvalue: " +shortobj);


	}

}
