package training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCustomerOnPriorityImpl {
	
	// before java 8 
	
	public static List<PriorityCustomer> withSalaryMoreThan(List<Customer> customers){
		
		List<PriorityCustomer> priorityCustomers = new ArrayList<>(); 
		
		for(Customer temp : customers) {
			if(temp.getSalary() > 5000) {
				PriorityCustomer priorityCustomer = 
						new PriorityCustomer(temp.getCustId(), 
								temp.getCustName(), true);
				
				priorityCustomers.add(priorityCustomer); 
			}
		}
		return priorityCustomers; 
	}
	
	
	public static List<PriorityCustomer> 
		withSalaryMoreThanInJava8(List<Customer> customers){
	
		List<PriorityCustomer> priorityCustomers = 
				customers.stream().map(temp -> {
					if(temp.getSalary()>5000) {
						return new PriorityCustomer(temp.getCustId(), 
									temp.getCustName(), true); 
					}
					return null; 
				}).collect(Collectors.toList()); 
		
		return priorityCustomers; 
	}
	
	public static List<PriorityCustomer> 
	withSalaryMoreThanInJava8WithFilter(List<Customer> customers){
		return 
				customers
					.stream()
					.filter(temp ->  
						temp.getSalary() >5000
						
				 ).map(temp -> {
					 return new PriorityCustomer(temp.getCustId(),
								temp.getCustName(), true); 
				}).collect(Collectors.toList()); 


		
	}
	
	
	// java 8 way 
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
		
				new Customer(101, "Sandeep", 8000, "Developer"), 
				new Customer(223, "Harry", 2233, "Accountant"), 
				new Customer(332, "Udit", 12000, "Software Engineer"), 
				new Customer(56, "Peter", 4500, "Plumber") 
		);
		
		List<PriorityCustomer> priorityCustomers = withSalaryMoreThan(customers); 
		
		priorityCustomers.forEach(System.out :: println);
		System.out.println("-----------------------------------");
		List<PriorityCustomer> priorityCustomers1 = withSalaryMoreThanInJava8(customers); 
		priorityCustomers1.forEach(System.out :: println);
		
		
		System.out.println("-----------------------------------");

		List<PriorityCustomer> priorityCustomers2 = withSalaryMoreThanInJava8WithFilter(customers); 
		priorityCustomers2.forEach(System.out :: println);
		
	
	}
}



















