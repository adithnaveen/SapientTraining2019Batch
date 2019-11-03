package training.day4.collections;

import java.util.Comparator;
import java.util.TreeSet;

// to show working of TreeSet 
// in sorted order 
public class CollEx06 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>(); 
		
		set.add("Himanshu"); 
		set.add("Praneeth"); 
		set.add("Udit"); 
		set.add("Anjani"); 
		set.add("Chris"); 
		
		System.out.println(set);
		
		
		System.out.println("----------------------------------");
		
		TreeSet<Device> devices = new TreeSet<>
				(DeviceSortingTemplate.sortAscName());
		

		devices.add(new Device(101, "Laptop", 500)); 
		devices.add(new Device(102, "KeyBoard", 35)); 
		devices.add(new Device(33, "Presenter", 45)); 
		devices.add(new Device(44, "Styluss", 67)); 
		

		for(Device temp : devices) {
			System.out.println(temp.hashCode() +"," + temp);
		}
		
		
		
		
		
	}
}
