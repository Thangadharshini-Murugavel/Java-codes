package secondtask;
import java.util.Scanner;
public class first {
	public static void main(String []args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter Length: ");
int l = scan.nextInt();
System.out.println("Enter Breadth: ");
int b = scan.nextInt();
if(l==b) {
	System.out.println("It is Square");
}
else {
	System.out.println("It is Rectangle");
}
}
}
