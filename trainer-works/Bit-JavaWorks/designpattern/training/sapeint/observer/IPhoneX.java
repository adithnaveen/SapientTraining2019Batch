package training.sapeint.observer;

import java.util.ArrayList;
import java.util.List;

public class IPhoneX implements Observable {

	private List<Observer> users;
	private boolean arrived;
	
	public IPhoneX(){
		users = new ArrayList<Observer>();
	}
	
	
	@Override
	public void addUser(Observer observer) {
		users.add(observer);
	}

	@Override
	public void removeUser(Observer observer) {
		users.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer user: users){
			user.update();
		}
	}

	public boolean isArrived(){
		return arrived;
	}
	
	public void setArrived(boolean arrived){
		this.arrived = arrived;
//		notifyObserver();
	}
	
	public void boughtIPhoneX(Observer observer){
		System.out.println("Kudos to you have bough iphone...");		
		removeUser(observer);
	}
	
}