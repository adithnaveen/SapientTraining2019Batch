package training.day2;

class AcceptCommand{
	public static  void checkDevice(RemoteControl device) {
		device.on(); 
		device.off(); 
	}
}


public class InterfaceImpl {
	public static void main(String[] args) {
		RemoteControl rc = new AC(); 
		AcceptCommand.checkDevice(rc);
		
		rc = new Lamp();  
		AcceptCommand.checkDevice(rc);
		
		rc = new NightLampt(); 
		AcceptCommand.checkDevice(rc);
		
	}
}
