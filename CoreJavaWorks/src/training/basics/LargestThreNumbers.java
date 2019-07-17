package training.basics;

public class LargestThreNumbers {
	public static void main(String[] args) {
		int num1 = 100; 
		int num2 = 33; 
		int num3 = 44; 
		
		System.out.println(
			num1 > num2 && num1 > num3 ? "Num1 Is Largest" :
					num2 > num3 ?"Num2 Is Largewt" :"Num3 Is Largest"
			);
	}
}
