package ps;
import java.util.Scanner;
public class gg {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter a number to find its last two digits:");
	int a = scan.nextInt();
	int b = a%100;
	System.out.println("Last two digits are:"+b);
}
}
