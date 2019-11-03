package training.day2;

public class AccountImpl {
	public static void main(String[] args) {
		Account account1 = new Account("Mayur", 2000);
		Account account2 = new Account("Umang", 4000);

		System.out.println(
				account1.getAccountId() + ", " + 
				account1.getCustomerName() + ", " + 
				account1.getInitialBalance());

		System.out.println(
				account2.getAccountId() + ", " + 
				account2.getCustomerName() + ", " + 
				account2.getInitialBalance());

	}
}
