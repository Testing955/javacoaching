package Collections;

/*HashSet - a class-implemented Set interface

1) Heterogenios data ---> allowed

2) Insertion order --> Not preserved (Index not supported)

3) Duplicate elements --> Not Allowed

4) Multiple nulls Not allowed/ only single null is allowed*/


import java.util.HashSet;
import java.util.Set;


public class HashSetDemo 
{

	public static void main(String[] args) 
	{
HashSet myset = new HashSet();
myset.add(100);
myset.add(100);
myset.add(null);
myset.add(null);
myset.add("Welcome");
myset.add(100.90);
System.out.println(myset.size());
//for (Object x: myset)   //"Object x: objectname keywords is used to read the data from the list"
//
//{
//System.out.println(x);
//}
System.out.println(myset.remove(100.90));
System.out.println(myset);

	}

}
