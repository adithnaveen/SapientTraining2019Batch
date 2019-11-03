package training.sapient.inheritence;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CellPhone extends Product{

	
	private String type; // smartphone, featured 
	private String os; 
	private String connectivitiy; // gsm/ cdma 
	public CellPhone(int pId, String pName, String pDesc, 
		double pPrice, String type, String os, String connectivitiy) {
		
		
		super(pId, pName, pDesc, pPrice);
		this.type = type;
		this.os = os;
		this.connectivitiy = connectivitiy;
	}
	
	 
	
}
