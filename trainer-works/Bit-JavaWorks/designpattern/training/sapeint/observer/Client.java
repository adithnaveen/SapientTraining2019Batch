package training.sapeint.observer;

public class Client {
	public static void main(String[] args) {
		Observable observable = new IPhoneX();
		
		Observer user1 = new User(observable, "Gopinath");
		Observer user2 = new User(observable, "Ishan");
		Observer user3 = new User(observable, "Kanchan");

		observable.addUser(user1);
		observable.addUser(user2);
		observable.addUser(user3);
		System.out.println("-----------------------------");
		((IPhoneX)observable).notifyObserver();
		
		((IPhoneX)observable).removeUser(user1);
		System.out.println("-----------after removing user1------------------");
		((IPhoneX)observable).notifyObserver();
		
		
		((IPhoneX)observable).boughtIPhoneX(user3);
		System.out.println("---------User3 bought iphonex--------------------");
		((IPhoneX)observable).notifyObserver();
		
		
//		((IPhoneX)observable).setArrived(true);
		
		
	}
}