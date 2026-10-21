package secondtask;
import java.util.Scanner;
public class tenmod {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any number to check it is divisble by 10:");
	int a = scan.nextInt();
	if(a%10==0) {
		System.out.println(+a+" is divisible by 10");
	}
	else {
		System.out.println(+a+" is not divisible by 10");
	}
}
}
