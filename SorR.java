package ps;
import java.util.Scanner;
public class SorR {
public static void main(String[] args) {
	Scanner lb = new Scanner(System.in);
	System.out.println("Enter the Length:");
	int Length = lb.nextInt();
	System.out.println("Enter the Breadth:");
	int Breadth = lb.nextInt();
	if (Length!=Breadth) {
		System.out.println("It is a Rectangle");
	}
	else {
		System.out.println("It is a Square");
	}
}
}
