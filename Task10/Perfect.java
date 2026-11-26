package tenth_task;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int n = s.nextInt();
		
		int divsum=0;
		
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				divsum+=i;
			}
		}
		

		
		if(n==divsum) {
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}
		
		
		
		

		s.close();
	}
	

}
