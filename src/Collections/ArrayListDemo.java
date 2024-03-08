package Collections;

/*
 1) Heterogenious data - allowed
( 2) Insertion order-preserved (Index)
3) Duplicate elements -- allowed
4) multiple nulls -- allowed

If the data is accepting all these 4 concepts then we can choose array list concept 

 */
import java.util.ArrayList;
public class ArrayListDemo 
{
public static void main(String args[])
{

	ArrayList mainlist = new ArrayList();
	mainlist.add(100);
	mainlist.add("Welcome");
	mainlist.add(true);
	mainlist.add(null);
	mainlist.add(null);
	mainlist.add(879.89);

	mainlist.remove(2);  //".remove keyword is used to remove the data from the list"
	mainlist.add(859);   //".add keyword is word to add the index to list and it is adding in the end of the list"
	mainlist.add(2,"Hello"); //".add(place, index value) keyword is used to add the the index to the list in such specific place"
//	System.out.println(mainlist.get(4)); // ".get keyword is used to fetch the specific result from the list"
//	for (Object x: mainlist)   //"Object x: objectname keywords is used to read the data from the list"
//
//	{
//	System.out.println(x);
//	}
//	mainlist.clear();
//	System.out.println("The data is empty" + mainlist);
//	}
	System.out.println(mainlist);
	
}
	
}
