package training.day4.io;

import java.io.File;

public class FileOperation02 {
	public static void main(String[] args) {
		File f = new File("sample");
		
		System.out.println(f.isDirectory());
		
		File[] listFiles = f.listFiles();
		
		for(File temp : listFiles) {
			System.out.println(temp.getName());
		}
		
	}
}
