package training.day2;

public class Lamp implements RemoteControl{

	@Override
	public void on() {
		System.out.println("Lamp is On");
	}

	@Override
	public void off() {
		System.out.println("Lamp is Off");
	}
	
}
