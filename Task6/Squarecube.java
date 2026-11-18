package functions;

import java.util.Scanner;

public class Squarecube {

public int square(int a) {
	return (int)Math.pow(a, 2);
}

public int cube(int b) {
	return (int)Math.pow(b, 3);
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Squarecube cc = new Squarecube();
	System.out.print("Enter any number to find its square : ");
	int num = s.nextInt();
	System.out.println("Square: " + cc.square(num));
	System.out.println();
	System.out.print("Enter any number to find its cube : ");
	int numb = s.nextInt();
	System.out.println("cube: " + cc.cube(numb));
	
	s.close();
	
}

 
 
}
