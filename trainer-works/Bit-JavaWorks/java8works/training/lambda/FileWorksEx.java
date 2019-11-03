package training.lambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWorksEx {
	public static void main(String[] args) 
				throws FileNotFoundException, IOException {
		// old way 
		// oldWay();
		
//		java8FileVers01();
		
		try(Stream st = Files.lines(Paths.get("Emp.txt"))){
			st.forEach(System.out :: println);
		}
		
		
		
		
	}

	private static void java8FileVers01() throws IOException, FileNotFoundException {
		// in java 8 with reader 
		// you dont have to have the finally block 
		
		try(
				BufferedReader br = new BufferedReader(new FileReader("emp.txt")) ;
			){
			
			br.lines().forEach(System.out :: println);
			
		}
	}

	private static void oldWay() {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("Emp.txt"));
			String line =null; 
			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
