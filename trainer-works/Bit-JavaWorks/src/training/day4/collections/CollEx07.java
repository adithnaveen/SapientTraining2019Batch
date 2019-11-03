package training.day4.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// to show working of maps (HashMap)
public class CollEx07 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(); 
		
		
		map.put("harry", 2000); 
		map.put("peter", 3000); 
		map.put("becky", 4000);
		
		
//		System.out.println(map.get("harry"));
//		System.out.println(map.get("peter"));
		
		
		Set entrySet = map.entrySet(); 
		
		Iterator itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry temp = (Entry) itr.next();
			
			System.out.println("Key is " + temp.getKey()
				+", value is " +  temp.getValue());
			
		}
		
		
		
		
	}
}
