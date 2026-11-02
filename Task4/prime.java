package loop;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter any number to find whether it is prime or composite: ");
	int n = s.nextInt();
	while(true) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count+=1;
			}
		}
	    if(n<=1){
			System.out.println(n+" is neither prime nor composite number");
		}
		else if(count>2) {
			System.out.println(n+" is a composite number");
		}
		else {
			System.out.println(n+" is a Prime number");
		}
	}
}
}
