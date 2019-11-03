package training.sapient.spring01;

import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
	public static void main(String[] args) {
		/*XmlBeanFactory factory = new 
			XmlBeanFactory(new ClassPathResource("SpringContext.xml")); */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml"); 
		
		
		IHelloService helloService = (IHelloService) context.getBean("hello"); 
		
		System.out.println(helloService.sayHello());

		Scanner sc = new Scanner(System.in); 
		
		System.out.println(helloService.sayHello(sc.next(), sc.next()));


		
		
		
	}
}
