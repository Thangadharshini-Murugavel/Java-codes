package ps;
import java.util.Scanner;
public class ii {
public static void main(String[] args) {
	Scanner ff= new Scanner (System.in);
	System.out.println("Enter any value to find its last digit:");
	int a = ff.nextInt();
	a = a%10;
	System.out.println("The last digit:"+a);
	
}
}
