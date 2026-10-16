package ps;
import java.util.Scanner;
public class fifty {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("To find area of shape choose 1-Square,2-Rectangle,3-Triangle");
	int a = scan.nextInt();
	if(a==1) {
		System.out.println("Enter Length:");
		float L = scan.nextFloat();
		System.out.println("Enter Breadth:");
		float B = scan.nextFloat();
		float ans = L*B;
		System.out.println("Area of Rectangle:"+ans);
		
	}
	else if(a==2) {
		System.out.println("Enter Side value:");
		float S = scan.nextFloat();
		float ans = S*S;
		System.out.println("Area of Square:"+ans);
	}
	else if(a==3) {
		System.out.println("Enter Triangle Length:");
		float Z = scan.nextFloat();
		System.out.println("Enter Triangle Breadth:");
		float Y= scan.nextFloat();
		float ans = 0.5f*Z*Y;
		System.out.println("Area of Triangle:"+ans);
		
		
	}
	else {
		System.out.println("Invalid Input");
		
	}
}
}
