package training.day2;

public class NightLampt extends Lamp implements RemoteControl{

	@Override
	public void on() {
		System.out.println("Night Lamp Is On ");
	}

	@Override
	public void off() {
		System.out.println("Night Lamp Is Off ");

	}
}
