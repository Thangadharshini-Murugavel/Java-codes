package exceptionandfilehandling;

import java.util.Scanner;

public class Stringg {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	try {
		System.out.println("Enter any number: ");
		String a = s.nextLine();
		int num = Integer.parseInt(a);
		
		System.out.println("Entered number: "+num);
	}catch(NumberFormatException e) {
		System.out.println("Invalid number");
	}finally {
		s.close();
	}
	
}
}
