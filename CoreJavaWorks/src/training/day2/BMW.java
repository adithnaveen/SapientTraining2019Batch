package training.day2;

public class BMW extends FourWheeler {

	private String player;

	public BMW(int noOfDoors, FuelType fuelType, String player) {
		super(noOfDoors, fuelType);
		this.player = player;
	}

	public void musicPlayer() {
		System.out.println("BMW comes with " + player + " player");
	}

	@Override
	public void move() {
		System.out.println("BMW Moves with Auto Gear");
	}

	@Override
	public void stop() {
		System.out.println("BMW stop, with ABS");
	}
}
