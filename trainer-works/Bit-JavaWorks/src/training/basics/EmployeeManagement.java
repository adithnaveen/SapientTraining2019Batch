package training.basics;


public class EmployeeManagement {

	public static void main(String[] args) {
		
		Employee e = null; 
		e = new Employee(); 
		
		e.setEmpId(101);
		e.setEmpName("sa");
		e.setEmpSal(-30000);


		
		System.out.println("Emp   "+  e.toString());
		
		
	}
}
