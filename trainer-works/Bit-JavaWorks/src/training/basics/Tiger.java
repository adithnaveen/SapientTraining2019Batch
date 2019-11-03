package training.basics;

public class Tiger extends Animal{

	public Tiger() {
		super();
	}
	
	@Override
	public void talk() {
		System.out.println("Talk talks... ");
	}

	@Override
	public void walk() {
		System.out.println("Tiger walks with 2 legs, 2 limbs");
	}

	@Override
	public void sleep() {
		System.out.println("Tiger Sleeps on the tree.. ");
	}
	
	
	public void attack() {
		System.out.println("Tiger feeds by attacing on some prey ");
	}
	
	
	
	
	
	
	
	
	
	
	
}
