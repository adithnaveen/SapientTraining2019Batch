package training.sapeint.factory;

public class Car {

	
	public static Car getMyCar(String carName) {
		
		if(carName.equals(ICars.FORD)) {
			return new Ford(); 
		}else if(carName.equals(ICars.MARUTI)) {
			return new Maruti(); 
		}else if(carName.equals(ICars.AUDI)) {
			return new Audi(); 
		}
		
		return null; 
	}

}
