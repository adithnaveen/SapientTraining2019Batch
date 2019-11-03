package training.day3;

class Customer {
	private String customerName;
	private String email;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

public class UserDefExceptionEx {
	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setCustomerName("ha");
		customer.setEmail("harry@gmail.com");
		int amount = 10;
		try {
			performTransaction(customer, amount);
		} catch (NameTooSmallException e) {
			e.printStackTrace();
		} catch (InvalidAmountExcaption iae) {
			iae.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	// throw
	// throws
	private static void performTransaction(Customer customer, int amount)
			throws Exception  {

		try {
		checkName(customer.getCustomerName());

		if (amount > 100) {
			System.out.println("Transaction Succesfully to " + customer.getCustomerName());
		} else {
			throw new InvalidAmountExcaption("Sorry transaction not successfuly due to Amount: " + amount);
		}
		}catch (NameTooSmallException e) {

			throw new Exception("Sorry It was not Perfomred", e); 
		}
	}
	
	
	
	
	public static void checkName(String name) throws NameTooSmallException {
		if(name.length() < 3) {
			throw new NameTooSmallException(
					"Sorry Transaction cannot be performed because of (" +
			name + ") is small ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
