package training.sapient.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Component
public class Mobile {
	
	@Autowired
	private Camera camera; 
	
	@Autowired
	private Screen screen; 
	
	@Autowired
	private Speaker speaker; 
	
	
	
}
