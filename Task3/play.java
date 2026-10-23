package third_Task;

import java.util.Scanner;

public class play {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter 1 to have fun out,or enter anything to stay home:");
	int n = s.nextInt();
	if(n==1) {
		System.out.println("You can go out and play");
	}
	else {
		System.out.println("You cannot go out and play");
	}
	}
}
