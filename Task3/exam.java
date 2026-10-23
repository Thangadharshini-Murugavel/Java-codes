package third_Task;

import java.util.Scanner;

public class exam {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number to know your luck in exam:");
	int n = s.nextInt();
	if(n==1) {
		System.out.println("The Exam will be easy");
	}
	else {
		System.out.println("The Exam will be difficult");
	}
	}
}
