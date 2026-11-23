package exceptionandfilehandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multicatch {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	try {
		System.out.println("Enter dividend: ");
		int a = s.nextInt();
		System.out.println("Enter divisor: ");
		int b = s.nextInt();
		
		int c = a/b;
		System.out.println("Quotient: "+c);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}catch(InputMismatchException e) {
		System.out.println("Invalid input");
	}finally {
		s.close();
	}
}
}
