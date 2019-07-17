package training.day2;

public abstract class FourWheeler extends Vehicle {

	private int noOfDoors;
	private FuelType fuelType;

	public FourWheeler(int noOfDoors, FuelType fuelType) {
		super();
		this.noOfDoors = noOfDoors;
		this.fuelType = fuelType;
	}
	
	

	protected FuelType getFuelType() {
		return fuelType;
	}



	protected int getNoOfDoors() {
		return noOfDoors;
	}



	public void doors() {
		System.out.println("Four Wheeler has " + noOfDoors + " doors");
	}

	public void fuelType() {
		System.out.println("This Four wheels runs on " + fuelType);
	}

 
}
