package functions;

import java.util.Scanner;

public class Addition {

public double sum(int a,double b) {
	double result = a+b;
	return result;
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Addition a = new Addition();
	System.out.print("Enter any Integer: ");
	int x = s.nextInt();
	System.out.print("Enter any decimal number: ");
	double y = s.nextDouble();
	System.out.print("The sum of "+x+" and "+y+" is :"+(a.sum(x, y)));
	s.close();
	
	
	
}
}
