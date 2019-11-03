package training.day3;

import java.util.Scanner;

public class AcceptValuesFromEndUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Enter your name ");
		
		String name = sc.next(); 
		
		System.out.println("Hey " + name +" welcome ");
	}
}
