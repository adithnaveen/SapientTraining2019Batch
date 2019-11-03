package training.day4.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		Properties prop = new Properties(); 
		
		prop.load(new FileReader("db.properties"));

		System.out.println("User Name " + prop.getProperty("username"));
		System.out.println("Password Name " + prop.getProperty("password"));
		System.out.println("Database " + prop.getProperty("db"));
	}
}
