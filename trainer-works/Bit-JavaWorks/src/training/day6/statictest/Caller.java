package training.day6.statictest;

public class Caller {
	public static void main(String[] args) {
		try {
			Class.forName("training.day6.statictest.Loader");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
