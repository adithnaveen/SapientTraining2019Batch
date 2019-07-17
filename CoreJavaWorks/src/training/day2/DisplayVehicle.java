package training.day2;

// BusinessLogic Class 
public class DisplayVehicle {
	public static void showVehicle(Vehicle... vehicles) {

		if (vehicles == null) {
			System.out.println("Sorry no Vehicle found ");
			return;
		}

		for (Vehicle temp : vehicles) {
			System.out.println("--------------------------");
			
			temp.licence(); 
			temp.move();
			temp.stop();

			if (temp instanceof FourWheeler) {
				((FourWheeler) temp).doors();
				((FourWheeler) temp).fuelType();

				if (temp instanceof BMW) {
					((BMW) temp).musicPlayer();
				} else if (temp instanceof Maruti) {
					((Maruti) temp).engineeStandard();
				}
			} else if (temp instanceof TwoWheeler) {
			}

		}

	}
}
