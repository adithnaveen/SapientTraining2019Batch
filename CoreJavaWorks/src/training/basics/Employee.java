package training.basics;

// Entity 

// if a class does not extend from any class then the same 
// will be the child of Object 

// Java BEAN
// a class which has private variables public getters and setters 
class Employee {
	private int empId;
	private String empName;
	private double empSal;

	// if you dont have the implementation of
	// a default constructor then the JVM will give
	// the constructor

	public Employee() {
		// super should be 1st line 
		super();
		System.out.println("Hi i'm from constructor ");
	}

	// setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		if (empName.length() < 3) {
			System.out.println("Sorry Name too small ");
			this.empName = "No Name";
			return;
		}
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		if (empSal < 10000) {
			System.out.println("Salary Too less ");
			this.empSal = 10000;
			return;
		}
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
