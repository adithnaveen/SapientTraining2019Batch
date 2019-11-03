package training.sapient.spring01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class HelloService implements IHelloService{


	public HelloService() {
		System.out.println("Constructor Called... ");
	}
	
	private String name; 
	private String city; 
	
	public String sayHello() {
		return this.sayHello(name, city); 
	}

	public String sayHello(String name, String city) {
		
		String myString [] = {
				"Hey Mr/Mrs/Ms: %s, how is your city %s", 
				"Good Morning %s, heard your are in %s", 
				"Mr/Mrs/Ms: %s, your city %s is beautiful"
		}; 
		
		int randomNumber = (int) (Math.random() * 3); 
		
		return String.format(myString[randomNumber].toString(), name, city);
		
	}
	
}
