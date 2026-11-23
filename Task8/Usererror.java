package exceptionandfilehandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Usererror {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	try {
		System.out.println("Enter any integer: ");
		int a = s.nextInt();
		
		System.out.println("Entered number: " + a);
	}catch(InputMismatchException e) {
		System.out.println("pls enter valid input");
	}
	finally {
		s.close();
	}
}
}
