package training.day2;

public class Account {

	private int accountId;
	private String customerName; 
	private double initialBalance; 
	
	private static  int count =100; 
	
	public Account(String customerName, double initialBalance) {
		this.customerName = customerName; 
		this.initialBalance = initialBalance;
		
		this.accountId = count ++; 
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountId() {
		return accountId;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public int getCount() {
		return count;
	}
	
	
	
	
}
