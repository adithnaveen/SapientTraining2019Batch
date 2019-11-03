package training.day3;

import training.basics.EmployeeManagement;

public class ExceptionEx01 {
	public static void main(String[] args) {
		 
		// alt + shift + z 
			try {
				
				System.out.println("Open connectionn ");
				int num1 = Integer.parseInt( args[0]);  
				int num2 = Integer.parseInt( args[1]);  
				
				try {
					int [] arr = new int[-4];
				}catch(NegativeArraySizeException nase) {
					nase.printStackTrace(); 
				}
				System.out.println("Result of division is " + (num1 / num2));
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch(NumberFormatException nfe) {
				nfe.printStackTrace(); 
			} catch(Exception e) {
				// super man 
				e.printStackTrace(); 
			} finally {
				System.out.println("Close connection ");
			}
		
			System.out.println("This is some other business logic");
		
	}
}
