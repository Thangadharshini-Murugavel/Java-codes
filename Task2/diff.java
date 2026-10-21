package secondtask;
import java.util.Scanner;
public class diff {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers to check its difference is zero or not zero");
	System.out.println("Enter first number:");
	int a = scan.nextInt();
	System.out.println("Enter Second number:");
	int b = scan.nextInt();
	double c = a-b;
	if(c==0){
		System.out.println("The differnce of "+a+" and "+b+" is Zero");
	}
	else {
		System.out.println("The differnce of "+a+" and "+b+" is "+c);
	}
	}
	
	
}

