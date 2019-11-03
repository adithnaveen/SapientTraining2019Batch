package training.day2;

class Dummy {
	private int variable;

	public Dummy(int variable) {
		super();
		this.variable = variable;
	}

	public int getVariable() {
		return variable;
	}

}

class MyClass extends Dummy {

	public MyClass(int variable) {
		super(variable);
		// TODO Auto-generated constructor stub
	}

	public int getVariable() {
		return 33;
	}

}

public class ImmutableMutableEx {
	public static void main(String[] args) {
		Dummy d = new Dummy(333);

		MyClass m = new MyClass(3434);

		System.out.println(d.hashCode());
		Dummy d1 = new Dummy(333);
		System.out.println(d1.hashCode());

	}
}
