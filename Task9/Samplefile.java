package nineth_task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Samplefile {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\ELCOT\\OneDrive\\Desktop\\employee.txt");
			if(f.createNewFile()) {
				System.out.println("File created: "+f.getAbsolutePath());
			}
			else {
				System.out.println("File already exists");
			}
		
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("Employee name : Priya\n");
		fw.write("Employee   ID : 101\n");
		fw.write("Department    : IT\n");
		fw.write("Salary        : 100000\n");
		
		fw.close();
		System.out.println("Data Written successfully!!");
		
		
		
		
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
