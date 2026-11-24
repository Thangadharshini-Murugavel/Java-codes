package nineth_task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {
public static void main(String[] args) {
	try {
		File f = new File("C:\\Users\\ELCOT\\OneDrive\\Desktop\\employee.txt");

        FileReader fr = new FileReader(f);
        
        try (BufferedReader br = new BufferedReader(fr)) {
			String data = br.readLine();
			while(data!=null) {
				System.out.println(data);
				data=br.readLine();
			}
		}
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}

}
}
