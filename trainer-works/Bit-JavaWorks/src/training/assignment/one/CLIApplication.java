package training.assignment.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLIApplication {
//	static {
//		
//	}
//	
	static File file = new File("Somefile.ser"); 
	
	public static void main(String[] args)
		throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		new Integer("234"); 
		
		
		theLoop:		
		while(true) {
			System.out.println("Enter Your Choice");
			System.out.println("1. Add, 2. Delete, 3. Update, 4. Exit");
			
			int choice = Integer.parseInt(br.readLine()); 
			
			switch (choice) {
			case 1:
					System.out.println("To Add a Record ");
				break;
			case 2:
				System.out.println("To Delete a record ");
				break;
			case 3:
				
				System.out.println("To Update a record ");
				break;
			case 4:
					System.out.println("Thanks for Using the application ");
					
				break theLoop; 
			default:
				System.out.println("Sorry wrong entry try again... ");
				break;
				
			}
		}
		
		
	}
}
