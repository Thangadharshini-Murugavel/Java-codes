package tenth_task;

import java.util.Scanner;

public class SumofDigits {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number to find the sum of digits: ");
	int n = s.nextInt();
	int sum = 0;
	
	while(n>0) {
		int temp=n%10;
		sum+=temp;
		n/=10;
		
		
	}
	System.out.println("Sum of digits of is : "+sum);
	s.close();
}

}
