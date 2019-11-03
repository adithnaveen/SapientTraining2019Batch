package training.day4.collections;

import java.util.Vector;

// show working of vectors 
public class CollEx03 {

	
	public static void main(String[] args) {
		Vector<String> list= new Vector<>(7, 5); 
		
		System.out.println("Initial Capacity is " + list.capacity());
		System.out.println("Initial Size is " + list.size());
		
		list.add("One"); 
		list.add("Two"); 
		list.add("Three"); 
		list.add("Four"); 
		list.add("Five"); 
		
		list.add("One"); 
		list.add("Two"); 
		
		
		list.add("Three"); 
		list.add("Four"); 
		list.add("Five"); 
		
		list.add("One"); 

		System.out.println(list);
		System.out.println("After Adding Capacity is " + list.capacity());
		System.out.println("After Adding Size is " + list.size());
		
		
	}
}
