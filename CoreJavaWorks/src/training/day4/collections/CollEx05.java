package training.day4.collections;

import java.util.HashSet;

class Device implements Comparable<Device>{
	private int dId; 
	private String dName; 
	private double dPrice;
	
	
	@Override
	public String toString() {
		return "Device [dId=" + dId + ", dName=" + dName + ", dPrice=" + dPrice + "]";
	}
	
	public Device(int dId, String dName, double dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}
	
	
	
	@Override
	public int hashCode() {
		 return this.dName.charAt(0); 
	}

	@Override
	public boolean equals(Object obj) {
		Device device = (Device) obj; 
	
		return this.dId == device.dId 
				&& this.dName.equals(device.dName) 
				&& this.dPrice == device.dPrice; 
			 
	}

	protected int getdId() {
		return dId;
	}
	protected void setdId(int dId) {
		this.dId = dId;
	}
	protected String getdName() {
		return dName;
	}
	protected void setdName(String dName) {
		this.dName = dName;
	}
	protected double getdPrice() {
		return dPrice;
	}
	protected void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}

	@Override
	public int compareTo(Device o) {
		return this.dId - o.dId; 
	} 
}

public class CollEx05 {
	public static void main(String[] args) {
		
		HashSet<Device> set = new HashSet<>(); 
		
		set.add(new Device(101, "Laptop", 500)); 
		set.add(new Device(102, "KeyBoard", 35)); 
		set.add(new Device(33, "Presenter", 45)); 
		set.add(new Device(44, "Styluss", 67)); 
		
		set.add(new Device(44, "Styluss", 67)); 
		
		for(Device temp : set) {
			System.out.println(temp.hashCode() +"," + temp);
		}
		
	}
}

















