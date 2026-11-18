package functions;

import java.util.Scanner;

public class Armstrong {

	public void printArmstrong(int num) {
		int og = num;
		int temp = num;
		int sum = 0;
		int count = 0;
		int digit;
		
		while(temp>0) {
			count++;
			temp/=10;
		}
		
		temp=num;
		while(temp>0) {
			digit=temp%10;
			sum+=(int)Math.pow(digit,count);
			temp/=10;
			
		}
		
		if(sum==og) {
			System.out.println(og+" is a Armstrong Number");
		}
		else {
			System.out.println(og+" is not a Armstrong Number");
		}
	}
	
	
	
	public static void main(String[] args) {
		Armstrong a = new Armstrong();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number to check whether it is Armstrong or not: ");
		int as = s.nextInt();
		a.printArmstrong(as);
		s.close();
	}
}
