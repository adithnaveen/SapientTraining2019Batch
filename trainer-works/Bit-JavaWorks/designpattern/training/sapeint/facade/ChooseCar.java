package training.sapeint.facade;

public class ChooseCar {
	private HatchBack hatchBack;
	private SUV suv;
	private Sedan sedan;

	public ChooseCar() {
		hatchBack = new HatchBack();
		suv = new SUV();
		sedan = new Sedan();
	}

	public void driveHatchBack() {
		this.hatchBack.drive();
	}

	public void driveSUV() {
		this.suv.drive();
	}

	public void driveSedan() {
		this.sedan.drive();
	}

}
