package exceptionandfilehandling;

import java.util.Scanner;

public class Arithmetic {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a dividend: ");
	int a = s.nextInt();
	System.out.println("Enter a divisor: ");
	int b = s.nextInt();
	
	try {
		int c = a/b;
		System.out.println(a+" / "+b+" = "+c);
	}catch (ArithmeticException e) {
	    System.out.println(e.getMessage());
	}
	
	
s.close();
			
}
}
