package training.sapeint.observer;

public interface Observable {
	public void addUser(Observer observer);
	
	public void removeUser(Observer observer);
	
	public void notifyObserver();
}