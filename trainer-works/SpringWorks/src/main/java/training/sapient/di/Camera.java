package training.sapient.di;

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
public class Camera {
	// dslr, vga, point and shoot 
	private String type;
	private int pixels; 
	
}
