package loop;

import java.util.Scanner;

public class factorsum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("Enter any number to find its sum of factors: ");
		int n = s.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=n) {
			if(n%i==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("The sum of factors of "+n+" is "+sum);
	}
}
}
