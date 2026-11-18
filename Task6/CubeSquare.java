package functions;

import java.util.Scanner;

public class CubeSquare {
	public static int square(int a){
		return a*a;
	}
	
	public static int cube(int b) {
		return b*b*b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number to find its square: ");
		int a = s.nextInt();
		System.out.println("The square of "+a+" is "+square(a));
		
		System.out.println();
		System.out.print("Enter any number to find its cube: ");
		int b = s.nextInt();
		System.out.println("The cube of "+b+" is "+cube(b));
	
	}
}
