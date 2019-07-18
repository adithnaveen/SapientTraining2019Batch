package training.day4.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// to read the data from the user and keep the 
// same in the file 
public class ReadWriteData {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Employee Id : ");
		int empId = Integer.parseInt(br.readLine());

		System.out.println("Enter your Name : ");
		String empName = br.readLine();

		System.out.println("Enter Salary : ");
		double salary = Double.parseDouble(br.readLine());

		display(empId, empName, salary);

		// write the data to the file
		// writeData(empId, empName, salary);

		
		readFromFile(); 
	}

	private static void readFromFile() throws FileNotFoundException, IOException {
		// read the contents from file 
		
		
		BufferedReader brFile = new BufferedReader(new FileReader("Emp.txt")); 
		String line = null; 
		
		System.out.println("File Contents ");
		System.out.println("-------------------------------------------");
		while((line = brFile.readLine())!=null) {
			System.out.println(line);
		}
		
		brFile.close();
	}

	private static void writeData(int empId, String empName, double salary) throws IOException {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("Emp.txt", true) );

			bw.write("Empid:" + empId);
			bw.newLine(); 
			bw.write("EmpName:" + empName);
			bw.newLine(); 
			bw.write("EmpSal:" + salary);
			bw.newLine(); 

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			// the persistence will happen here
			bw.close();
		}

		System.out.println("Data Written... ");
	}

	private static void display(int empId, String empName, double salary) {
		// showing the results
		System.out.println("EmpId : " + empId);
		System.out.println("Emp Name " + empName);
		System.out.println("Emp Salary " + salary);
	}
}
