package training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DevicePredicateImpl {
	public static void main(String[] args) {
		List<Device> devices  = Arrays.asList(
				new Device(101, "laptop", 2323, "electronics"), 
				new Device(34, "paper", 12, "stationery"), 
				new Device(22, "mouse", 324, "mouse"), 
				new Device(44, "bottle", 10, "other"), 
				new Device(55, "keyboard", 23, "electronics")
		); 
		
		Predicate<Device> electronicDevices = ElectronicsPredicate.isElectronics(); 
		
		eavaluate(devices, electronicDevices);
		
		System.out.println("---------------------------------");
		
//		 it is electronics and more than 1000 
		
		
		Predicate<Device> electronicsAndAmountCheckPreciate = 
				electronicDevices.and(AmountPredicate.amountCheck(1000)); 
		
		eavaluate(devices, electronicsAndAmountCheckPreciate);
	}
	

	private static void eavaluate(List<Device> devices,
				Predicate<Device> predicate) {
		for(Device temp : devices) {
			if(predicate.test(temp)) {
				System.out.println(temp);
			}
		}
	}
	
	
	private static class ElectronicsPredicate{
		public static Predicate<Device> isElectronics(){
			return p -> p.getCategory().equalsIgnoreCase("electronics"); 
		}
	}
	
	
	private static class AmountPredicate{
		public static Predicate<Device> amountCheck(double price ){
			return p -> p.getPrice() > price; 
		}
	}
	
	
}
