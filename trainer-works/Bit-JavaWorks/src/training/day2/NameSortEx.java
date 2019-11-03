package training.day2;

import java.util.Arrays;

public class NameSortEx {
	public static void main(String[] args) {
		String [] names = {"Praneeth", "Himanshu", "Anuraj", "Udit", "Saurajit"};
		
		for(String temp : names) {
			System.out.println(temp);
				
		}
		
		Arrays.sort(names); 

		System.out.println("----------------------------------------------");
		
		for(String temp : names) {
			System.out.println(temp);
			
		}
		
		
		
	}
}
