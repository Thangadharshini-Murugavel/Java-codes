package third_Task;
import java.util.Scanner;
public class calc {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Choose 1-4 \n 1-Addition \n 2-Subtraction \n 3-Multiplication \n 4-Division \n Enter your choice:");
	int c = s.nextInt();
	s.nextLine();
	System.out.println("Enter first number:");
	int a = s.nextInt();
	s.nextLine();
	System.out.println("Enter Second number:");
	int b = s.nextInt();
	s.nextLine();
	if(c==1) {
		System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
	}
	else if(c==2) {
		System.out.println("The difference of "+a+" and "+b+" is "+(a-b));
	}
	else if(c==3) {
		System.out.println("The Product of "+a+" and "+b+" is "+(a*b));
	}
	else if(c==4) {
		if(b==0) {
			System.out.println("Zero division error");
		}
		else {
			System.out.println("The division of "+a+" and "+b+" is "+(a/b));
		}	
	}
	else {
		System.out.println("Invalid Input");
	}
}
}
