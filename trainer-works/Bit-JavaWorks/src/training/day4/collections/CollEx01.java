package training.day4.collections;

import java.util.ArrayList;

// program to show working of generic collections 

public class CollEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		
		list.add(33.2);  // list.add(new Double(33.2)); 
		list.add("hi"); // list.add (new String("hi")); 
		list.add(23); 
		list.add(new Object()); 
		list.add(true);
		
		for(Object temp : list) {
			System.out.println(temp);
			double dd = (double)temp ; 
			System.out.println("dd is " + dd );
		}
		
	}
}
