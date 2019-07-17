package training.day2;

public class AC extends Device implements RemoteControl {

	@Override
	public void on() {
		System.out.println("Ac Is On ");
	}

	@Override
	public void off() {
		System.out.println("AC Is Off");
	}
}
