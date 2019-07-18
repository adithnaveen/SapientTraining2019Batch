package training.day4.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		// to import ctrl + shift + o 
		File f = new File("HelloWorld.txt"); 
		
		if(f.exists()) {
			System.out.println("Hey File exists");
		}else {
			f.createNewFile(); 
			System.out.println("File Created");
		}
		
		System.out.println("Last Mofied " +  new Date(f.lastModified()));
		System.out.println("Can Read " + f.canRead());
		System.out.println("Absolute Path " + f.getAbsolutePath());
		System.out.println("File Name " + f.getName());
		
	}
}
