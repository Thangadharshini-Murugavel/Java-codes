package loop;

import java.util.Scanner;

public class table {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a positive integer to find its multiplication table: ");
	int t = s.nextInt();
	while(t<=0) {
		System.out.println("Invalid input! Enter positive integer:");
		t = s.nextInt();	
	}
	System.out.println("The multiplication table of "+t+ " :");
	for(int i=1; i<11; i++) {
		System.out.println(t+" * "+i+" = "+(t*i));
	}
}
}
