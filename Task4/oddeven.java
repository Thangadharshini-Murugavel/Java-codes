package loop;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of Integers:");
		int n = s.nextInt();
		int oddsum=0;
		int evensum=0;

		for(int i=0; i<n; i++) {
			System.out.println("Enter a Integer:");
			int j = s.nextInt();
			if(j%2==0) {
				evensum+=i;
			}
			else {
				oddsum+=i;
			}
		}
		System.out.println("The sum of odd Integers: "+oddsum);
		System.out.println("The sum of even Integers: "+evensum);
		
				
		
	}

}
