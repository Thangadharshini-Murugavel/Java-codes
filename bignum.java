package third_Task;
import java.util.Scanner;
public class bignum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("compare two digit number to find which is greatest");
	System.out.println("Enter first digit:");
	int a = s.nextInt();
	System.out.println("Enter Second digit:");
	int b = s.nextInt();
	if (a>b) {
		System.out.println(+a+" is greatest");
	}else {
		System.out.println(+b+" is greatest");
	}
	
}
}
