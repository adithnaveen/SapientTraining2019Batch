package training.sapeint.bean;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

public class Customer {

	@Size(min = 2, max = 20)
	private String name;

	// name@domain.com
	@Email
	@NotNull
	private String email;

	@NotNull
	@Min(18)
	@Max(50)
	private Integer age;

	public enum Gender {
		MALE, FEMALE, TRANSGENDER
	}

	@NotNull
	private Gender gender;

	@NotNull
	@Past
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date birthDay;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
}
