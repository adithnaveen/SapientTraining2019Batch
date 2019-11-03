package training.day3;

// static, final, abstract, synchronized 

public class SyncronizeTest extends Thread {

	Account account;
	int amount;

	public SyncronizeTest(Account account, int withDrawAmount, String name) {
		this.account = account;
		this.amount = withDrawAmount;
		new Thread(this, name).start();
	}

	public void run() {

		account.withDraw(amount);

	}

	public static void main(String[] args) {
		Account account = new Account(1000);

		// two threads does the transaction
		new SyncronizeTest(account, 500, "Mr. A");
		new SyncronizeTest(account, 750, "Mr. B");

	}
}
