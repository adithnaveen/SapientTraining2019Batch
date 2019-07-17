package training.day3;

public class Account {
	private int balance;

	public Account(int balance) {
		// assume you are fetching from DB
		this.balance = balance;
	}

	public synchronized  void withDraw(int amount) {
		if (amount < balance) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			this.balance = balance - amount;

			System.out.println("Amount of " + amount + " is withdrawn, Balance " + this.balance);
		} else {
			System.out.println("Sorry you dont have sufficient" +
					" Balance, withdraw of " + amount + " discarded ");
		}

	}
}
