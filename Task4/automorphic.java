package loop;

import java.util.Scanner;

public class automorphic {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number to find it is automorphic or not: ");
	int n = s.nextInt();
	int sqr = (int)Math.pow(n,2);
	if(sqr%(int)Math.pow(10,String.valueOf(n).length())==n){
		System.out.println(n+" is a automorphic number");	
	}
	else {
		System.out.println(n+" is not a automorphic number");	
	}
}
}
