package training.day2;

public abstract class TwoWheeler extends Vehicle {
	public void selfStart(boolean flag) {
		System.out.println(flag ? "Two Wheeler has Self Start" : 
				"Two Wheeler Does not have Self Start");
	}

	public void hasNoOfGear(int noOfGears) {
		System.out.println("This two wheeler has " + noOfGears + " gears");
	}

}
