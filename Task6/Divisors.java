package functions;

import java.util.Scanner;

public class Divisors {
	
	
void printSumOfDivisors(int a) {
	int temp = a;
	int sum=0;
	
	for(int i=1; i<=temp; i++) {
		if(temp%i==0) {
			sum+=i;
		}
	}
	
	System.out.println("The Sum of Divisors are :"+sum);
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Divisors d = new Divisors();
	System.out.print("Enter any number to find its sum of divisors: ");
	int num = s.nextInt();
	d.printSumOfDivisors(num);
}


}
