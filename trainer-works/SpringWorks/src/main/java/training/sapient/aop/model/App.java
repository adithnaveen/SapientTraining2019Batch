package training.sapient.aop.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml"); 
		
		
		BankService bankService = context.getBean("banking", BankService.class);
		
		System.out.println(bankService.getCaAccount().getAccount().getBalance());
		System.out.println(bankService.getSbAccount());
	}
}
