package training.sapient.aop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class SBAccount {
	private Account account;
	
	public double showBalance() {
		return this.account.getBalance(); 
	}
	
}
