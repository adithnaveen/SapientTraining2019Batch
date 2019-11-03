package training.sapeint.observer;

public class User implements Observer{

	private Observable observable;
	private String name; 
	
	public User(Observable observable, String name){
		this.observable = observable;
		this.name = name;
	}
	
	@Override
	public void update() {
		buyIPhoneX();
	}
	
	// when somebody buys iphonex 
	public void buyIPhoneX(){
		System.out.println("Notified  to buy  : " + name);
	}
	
	public void unsubscribe(){
		observable.removeUser(this);
	}
}