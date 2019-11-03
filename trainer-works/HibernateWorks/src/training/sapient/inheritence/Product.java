package training.sapient.inheritence;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// SINGLE_TABLE -> is default
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="PRODUCT_TYPE", discriminatorType=DiscriminatorType.STRING)

// 2. table per class strategy 
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

@Inheritance(strategy=InheritanceType.JOINED)




@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
	@Id
	private int pId; 
	private String pName; 
	private String pDesc; 
	private double pPrice; 
}
