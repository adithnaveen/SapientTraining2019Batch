package training.day2;

// if your class have atlease 1 abstract method then the class to be marked 
// as abstract, and if you have the abstract class then creating an object 
// of that is not allowed. 


public abstract class Vehicle {
	
	// return-type access modifier access-specifier methodname (params)  
	
	// if you have the method as abstract then the class extending the 
	// same must have the implementation or that class should be abstract 
	
	public abstract void move() ;
	public abstract void stop();
	
	
	public void licence() {
		System.out.println("You should have licence. ");
	}
}
