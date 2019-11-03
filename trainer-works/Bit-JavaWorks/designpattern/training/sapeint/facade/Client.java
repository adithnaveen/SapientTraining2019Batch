package training.sapeint.facade;

public class Client {
	public static void main(String[] args) {
		ChooseCar car = new ChooseCar(); 
		
		car.driveHatchBack();
		
		car.driveSedan();
		
		car.driveSUV();
	}
}
