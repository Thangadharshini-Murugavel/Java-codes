package secondtask;
import java.util.Scanner;
public class square {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to find its square is above or below 50:");
	int s = scan.nextInt();
	float sq = s*s;
	if(sq>50) {
		System.out.println("Square of "+s+" is "+sq+" and it is above 50");
	}
	else {
		System.out.println("Square of "+s+" is"+sq+" and it is below 50");
	}
}
}
