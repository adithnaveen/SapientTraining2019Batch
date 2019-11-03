package training.basics;

public class Human extends Animal{

	public Human() {}
	
	@Override
	public void talk() {
		System.out.println("Human talk with accent... ");
	}

	@Override
	public void walk() {
		System.out.println("Human walks with 2 legs... ");
	}

	@Override
	public void sleep() {
		System.out.println("Human sleep for 7-8 hrs on bed... ");
	}
	
	public void work() {
		System.out.println("Human earn by working and eat.. ");
	}
	
	
	
}
