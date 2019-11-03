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

public class BankService {
	private SBAccount sbAccount; 
	private CAAccount caAccount; 
	
	
}
