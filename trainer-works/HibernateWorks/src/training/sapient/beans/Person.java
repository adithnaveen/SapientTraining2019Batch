package training.sapient.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="person_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id; 
	private Integer age;
	private String name; 
	private Double height; 
	
	@Column(name="dob")
	private Date birthDate; 
}

















