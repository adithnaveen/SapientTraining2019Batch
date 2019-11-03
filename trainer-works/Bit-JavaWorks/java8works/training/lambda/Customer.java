package training.lambda;

public class Customer {
	private int custId; 
	private String custName; 
	private double salary; 
	private String designation; 
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName, double salary, String designation) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", salary=" + salary + ", designation="
				+ designation + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}
