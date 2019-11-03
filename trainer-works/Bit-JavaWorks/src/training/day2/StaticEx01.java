package training.day2;

public class StaticEx01 {

	public static void addNum(int num1, int num2) {
		System.out.println("Addition " + (num1 + num2));
	}

	static {
		System.out.println("Hi i'm from first static block ");
	}

	static {
		System.out.println("Hi i'm from second static block ");
	}

	public static void main(String[] args) {

		addNum(10, 20);
	}

	
	public static void main(String args) {

		addNum(10, 20);
	}
	
	
	static {
		System.out.println("Hi i'm from third static block ");
	}

	public static void subNum(int num1, int num2) {
		System.out.println("Substract  " + (num1 + num2));
	}
}
