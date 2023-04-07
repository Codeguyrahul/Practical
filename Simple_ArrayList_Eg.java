package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;

public class Simple_ArrayList_Eg {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<String>();// creating array list
//add element in arraylist through object
	al.add("Ritu");
	al.add("hemant");
	al.add("Ritu");
	al.add("Deepak");
	al.add("upashana");
	al.add("rahul");
	System.out.println("List+"+al);
	
	//To find out how many elements an ArrayList have, use the size() method:
	System.out.println("arraylist length:"+al.size());
	
	//modify and change element from array-List  :-ref.set(0, "  "); method
	al.set(3,"prince");
	System.out.println("after modify list element at position 3rd:"+al);
	
	// access element from array-list :-ref.get(position) method
	System.out.println( "Access element from list at position4: "+al.get(4));
	
	
	//Loop through the elements of an ArrayList with a for loop, and use the size() method
	//to specify how many times the loop should run
	for(int i=0;i<al.size();i++) {
		System.out.println(" array list element index"+i+" :"+al.get(i));
	}
	
	
	// You can also loop through an ArrayList with the for-each loop:
	
	for(String i:al) {
		System.out.println("using for-each loop:"+i);
		
	}
	
	//Sort an ArrayList of Strings:
	Collections.sort(al);
	for(String j:al) {
		System.out.println("Sort the list by using Collections.sort:"+j);
	}
	
	
	//To remove an element, use the remove() method and refer to the index number:
	al.remove(2);
	System.out.println("Remove 2nd positon element:"+al);
	
	//To remove all the elements in the ArrayList, use the clear() method
	al.clear();
	System.out.println(" Clear all element from array-list:"+al);
	

	
	
	
	
	
	

}
}
