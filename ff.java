package ps;

import java.util.Scanner;

public class ff {
	public static void main(String []args){
		Scanner d = new Scanner(System.in);
		System.out.println("Enter First number to Swap:");
		int a = d.nextInt();
		System.out.println("Enter First number to Swap:");
		int b = d.nextInt();
		System.out.println("Before Swapping A="+a+" B="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After  Swapping A="+a+" B="+b);			
	}
}
