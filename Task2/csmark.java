package secondtask;
import java.util.Scanner;
public class csmark {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Computer Science Mark: ");
		int a = scan.nextInt();
		if(a>=50) {
			System.out.println("you're passed");
		}
		else {
			System.out.println("you're failed");
		}
	}
	}


