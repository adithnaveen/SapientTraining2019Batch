package training.sapient.inheritence;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Television extends Product {
	private String screenType; // led, lcd, crt
	private int size;
	private String resolution;

	public Television(int pId, String pName, String pDesc, double pPrice,
			String screenType, int size, String resolution) {
		super(pId, pName, pDesc, pPrice);
		this.screenType = screenType;
		this.size = size;
		this.resolution = resolution;
	}

}
