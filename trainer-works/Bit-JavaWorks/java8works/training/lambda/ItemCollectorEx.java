package training.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemCollectorEx {
	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item("apple", 10, new BigDecimal(77.88)), 
				new Item("banana", 20, new BigDecimal(22.8)), 
				new Item("watermelon", 3, new BigDecimal(7.12)), 
				new Item("apple", 8, new BigDecimal(56.67)), 
				new Item("apple", 1, new BigDecimal(40.88)), 
				new Item("banana", 100, new BigDecimal(30.88)), 
				new Item("apple", 78, new BigDecimal(20.88)), 
				new Item("banana", 12, new BigDecimal(10.88))
		); 
		
		
		// the item name ,counts 
		Map<String, Long> counts = items.stream().collect(
				Collectors.groupingBy(Item:: getName, Collectors.counting())
			); 
		
		System.out.println(counts);
		
		// sum of qty 
		Map<String, Integer> sumOfQty = 
			items.
			stream().
			collect(
					Collectors.groupingBy(Item::getName ,  
					Collectors.summingInt(Item :: getQty))); 
		
		System.out.println(sumOfQty);
		
		// find average of quantity for each product 
		Map<String, Double> average = items.stream().collect(
				Collectors.groupingBy(Item::getName, 
				Collectors.averagingDouble(Item::getQty))
				); 
		
		
		System.out.println(average);
		
		 
	}
}






















