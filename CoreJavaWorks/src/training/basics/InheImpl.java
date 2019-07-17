package training.basics;

public class InheImpl {

	public static void displayAnimal(Animal a) {
		System.out.println("---------------------");
		a.talk();
		a.walk();
		a.sleep();

		if (a instanceof Tiger) {
			((Tiger) a).attack();
		} else if (a instanceof Human) {
			((Human) a).work();
		}
	}

	public static void main(String[] args) {
//		ver01(); 

		Animal a = new Tiger();

		displayAnimal(a);
		a = new Human();
		displayAnimal(a);

	}

	private static void ver01() {
		Tiger t = new Tiger();

		t.sleep();
		t.walk();
		t.talk();

		System.out.println("-------------------------");

		Human h = new Human();
		h.sleep();
		h.walk();
		h.talk();
	}
}
