package tenth_task;

import java.util.Scanner;

public class Secondlargest {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the array length: ");
	int l = s.nextInt();
	int[] arr = new int[l];
	for(int i=0; i<l; i++) {
		System.out.print("Enter the element: ");
		arr[i]=s.nextInt();
	}
	int lar = Integer.MIN_VALUE;
	int sec_lar = Integer.MIN_VALUE;
	
	for(int j=0; j<l; j++) {
		if(arr[j]>lar) {
			sec_lar = lar;
			lar = arr[j];
		}
		else if(arr[j]<lar && arr[j]>sec_lar) {
			sec_lar = arr[j];
		}
		
	}
	
	System.out.println("The second largest element: "+sec_lar);
	
	
	s.close();
}
}
