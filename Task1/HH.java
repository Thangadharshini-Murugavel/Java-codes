package ps;
import java.util.Scanner;
public class HH {
public static void main(String[] args) {
	Scanner dd = new Scanner(System.in);
	System.out.println("Enter a five digit number:");
	int a = dd.nextInt();
	a = a/100;
	a = a%10;
	System.out.println("The Middle value:"+a);
	System.out.println("Square of Mid value: "+(a*a));
	
}

}
