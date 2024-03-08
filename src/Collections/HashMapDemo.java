package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
	//HashMap hm = new HashMap();
	//Same thing we can declare it by giving interface name
		//Map hm = new HashMap();
	//if we want to define the data type to the key and value then we've to specify them in Wrapper class
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(100,"John");
	hm.put(102,"Peter");
	hm.put(101,"Rose");
	hm.put(104, "Peter");
	hm.put(103, "Robin");
	hm.put(103, "Robert");
	//System.out.println(hm);
	System.out.println(hm.size());
	hm.remove(103);
	System.out.println("After remvoing the pair:"+ hm);
	System.out.println(hm.get(102));  //If we want to extract any specific value then we have to pass the key on get method
	//Print only keys only from HashMap
	System.out.println(hm.keySet());
	
	//Print only Values only from HashMap
	for(Object k:hm.keySet())   //here k is the key value
	{
	System.out.println(hm.get(k));
	//Print Keys and  Values  from HashMap
	System.out.println(k+"  " +hm.get(k));
	}
hm.clear();
System.out.println(hm);	
	}

}
