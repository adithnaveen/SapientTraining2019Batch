package training.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSorting {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person(101, "Kumar"), 
				new Person(23, "Anjani"), 
				new Person(34, "Chris"), 
				new Person(53, "Umang"), 
				new Person(21, "Mayur")
		);
		
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getPId() - o2.getPId(); 
			}
		});

		persons.forEach(System.out :: println);
		////////////////////////////////////////////
		// java 8 way 
		System.out.println("--------------In Asc Order of Id ---------------------");
		
		persons.sort((o1, o2) -> o1.getPId() - o2.getPId());
		persons.forEach(System.out :: println);
		
		System.out.println("-------------In  Asc Of Name ----------------------");
		persons.sort((Person o1, Person o2 ) -> o1.getPName().compareTo(o2.getPName())); 
		
		persons.forEach(System.out :: println);
		
		Comparator<Person> perAscName =
				(o1, o2 ) -> o1.getPName().compareTo(o2.getPName());
		
		// reverse order 
		System.out.println("-------------In  Desc Of Name ----------------------");
		persons.sort(perAscName.reversed());
		persons.forEach(System.out :: println);
		
	}
	
	
}
