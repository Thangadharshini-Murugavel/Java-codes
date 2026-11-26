package tenth_task;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = s.nextInt();
	int temp = n;
	int pow = 0;
	while(temp>0) {
		temp/=10;
		pow++;
	}
	temp = n;
	int sum=0;
	int dig = 0;
	while(temp>0) {
		dig = temp%10;
		sum += Math.powExact(dig, pow);
		temp/=10;
	}
	
	if(sum==n) {
		System.out.println(n+" is a Armstrong number");
	}
	else {
		System.out.println(n+" is not a Armstrong number");
	}
	s.close();
}
}
