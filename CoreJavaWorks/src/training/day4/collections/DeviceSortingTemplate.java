package training.day4.collections;

import java.util.Comparator;

public class DeviceSortingTemplate {

	public static  Comparator<Device> sortAscName(){
		return new Comparator<Device>() {

			@Override
			public int compare(Device o1, Device o2) {
				return o1.getdName().compareTo(o2.getdName()); 
			}
		};
	}
}
