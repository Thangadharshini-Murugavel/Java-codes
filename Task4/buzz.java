package loop;

import java.util.Scanner;

public class buzz {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("Enter any number to find buzz number or not: ");
		int b = s.nextInt();
		if(b>0 && (b%10==7 || b%7==0 )) {
			System.out.println(b+" is a buzz number");
		}
		else {
			System.out.println(b+" is  not a buzz number");
		}
	}
	
}
}
