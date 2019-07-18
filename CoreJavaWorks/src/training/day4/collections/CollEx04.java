package training.day4.collections;

import java.util.HashSet;

public class CollEx04 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(); 
		
		set.add("Himanshu"); 
		set.add("Praneeth"); 
		set.add("Udit"); 
		
		System.out.println(set.add("Sandeep"));
		
		System.out.println(set.add("Sandeep"));
		
		set.add("Sandeep");
		set.add("Sandeep");
		set.add("Sandeep");
		set.add("Sandeep");
		
		System.out.println(set);
	}
}
