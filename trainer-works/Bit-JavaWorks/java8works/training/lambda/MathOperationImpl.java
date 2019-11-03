package training.lambda;

public class MathOperationImpl {
	public static void main(String[] args) {
		
		// templates
		MathOperation add = (num1, num2) ->  num1 + num2  ; 
		MathOperation sub = (num1, num2) ->  num1 - num2  ; 
		MathOperation mul = (num1, num2) ->  num1 * num2  ; 
		MathOperation div = (num1, num2) ->  num1 / num2  ; 

		MathOperation mod =  
			(int num1, int num2)  ->  num1 % num2; 
		 
		 

		System.out.println(mod.operation(20, 6)); 
		
		
		
		
		int num1 = 30; 
		int num2 = 10; 
		
		System.out.println("Addition Of Two numbers  " + operate(num1, num2, add));
		System.out.println("Substraction Of Two numbers  " + operate(num1, num2, sub));
		System.out.println("Multiplication Of Two numbers  " + operate(num1, num2, mul));
		System.out.println("Division Of Two numbers  " + operate(num1, num2, div));
		
	}
	
	public static int operate(int num1, int num2, MathOperation operation) {
		return operation.operation(num1, num2); 
	}
	
}
