package loop;

import java.util.Scanner;

public class caps {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("Enter any character:");
		char n = s.next().charAt(0);
		if(n>='A'&& n<='Z') {
			System.out.println(n+" is a Capital letter!");
		}
		else {
			System.out.println(n+" is not  a Capital letter!");

		}
	}
}
}
