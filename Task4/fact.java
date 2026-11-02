package loop;

import java.util.Scanner;

public class fact {
public static void main(String[] args) {
	while(true) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number to find its Factorial: ");
		int n = s.nextInt();
		int fact=1;
		if(n==1) {
			System.out.println("The factorial of "+n+" is : 1");
			break;
		}
		else if(n<0){
			System.out.println("Please enter a positive number");
		}
		else {
			for(int i=1; i<=n; i++) {
				fact=fact*i;
			}
			System.out.println("The factorial of "+n+" is :"+fact);
			break;
		}

	}
	}
}
