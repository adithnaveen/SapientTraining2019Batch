package training.day4.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
	
		System.out.println("Before Adding -> Size : " + list.size());
		
		list.add("Hello"); 
		list.add("Mayur"); 
		list.add("Abhiliash"); 
		list.add("Shashank"); 
		
		System.out.println("After Adding -> Size : " + list.size());
		
		for(String temp : list) {
			System.out.println(temp);
		}
		
		System.out.println("---------------------");
		
		Iterator<String> itr = list.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------");

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add(1, "Umang");
		System.out.println(list);
		
		list.remove(2); 
//		list.clear(); 
		
		System.out.println(list);
		
		
		
	}
}
