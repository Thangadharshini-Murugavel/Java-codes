package loop;

import java.util.Scanner;

public class harshad {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("Enter any number to find whether it is harshad number or not: ");
		int n = s.nextInt();
		int temp = n;
		int sum = 0;
		while(temp>0) {
			int d = temp%10;
			sum+=d;
			temp/=10;
		}
		if(n % sum==0) {
			System.out.println(n+" is a Harshad number");
		}
		else {
			System.out.println(n+" is not a Harshad number");
		}
	}
}
}
