package arraystringsfunctions;

import java.util.Scanner;

public class DigiSum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int len = 10;
	System.out.println("Enter the elements total capacity is 10: ");
	int[] arr = new int[len];
	for(int i=0; i<len; i++) {
		arr[i]=s.nextInt();
	}
	
	
	int one = 0;
	int two = 0;
	for(int j=0; j<arr.length; j++) {
		if(arr[j]<10 && arr[j]>=0 ) {
			one+=arr[j];
		}
		else if(arr[j]>=10 && arr[j]<100 ) {
			two+=arr[j];
		}
	}
	
	System.out.println("The sum of single digit numbers are : "+one);
	System.out.println("The sum of double digit numbers are : "+two);

	
}
}
