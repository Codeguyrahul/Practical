package CollectionEg;

import java.util.Iterator;
import java.util.TreeSet;
//navigable set operation
public class g {
public static void main(String[] args) {
	//creating & adding elements
	TreeSet<String> set=new TreeSet<String>();  //creating treeSet
	set.add("A");
	set.add("N");
	set.add("D");
	set.add("P");
	set.add("Q");
	set.add("S");
	set.add("T");
	set.add("J");
	set.add("F");
	set.add("G");
	set.add("V");
	set.add("C");
	set.add("R");
	System.out.println("original set:"+set);
	//traversing elements through iterator in descending
	Iterator itr=set.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());}
		System.out.println("lowest value:"+set.pollFirst());
	    System.out.println("updated set After PollFirst:"+set);
	    System.out.println("Highest value: "+set.pollLast());
	    System.out.println("Updated set After PollLast:"+set);
	    System.out.println("rverse set:"+ set.descendingIterator());
	    //sortedset set operation
	    System.out.println("Head set"+set.headSet("Q"));
	    System.out.println("Sub set"+set.subSet("J","R"));
	    System.out.println("Tail set"+set.tailSet("Q"));
	}
}	

