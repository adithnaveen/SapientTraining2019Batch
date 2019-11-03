package training.day2;

public class Maruti extends FourWheeler {

	private String engineeStd;

	public Maruti(int noOfDoors, FuelType fuelType, String engineeStd) {
		super(noOfDoors, fuelType);
		this.engineeStd = engineeStd;
	}

	public void engineeStandard() {
		System.out.println("The maruti is " + engineeStd);
	}

	@Override
	public void doors() {
		System.out.println("This Maruti Comes with " + getNoOfDoors() + " doors");
	}

	@Override
	public void fuelType() {
		System.out.println("Fuel Type of Maruti is " + getFuelType());
	}

	@Override
	public void move() {
		System.out.println("Maruti moves with Manual / Auto Gear");
	}

	@Override
	public void stop() {
		System.out.println("Stops when applied break... ");
	}

}
