package arraystringsfunctions;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the length of array:");
	int l = s.nextInt();
	int[] arr = new int[l];
	for(int i=0; i<l; i++) {
		System.out.println("Enter the elements of array: ");
		arr[i]=s.nextInt();
	}
	System.out.println("Before sorting");
	for(int st:arr){
		System.out.print(st+" ");
	}
	System.out.println();
	System.out.println("After sorting");
	Arrays.sort(arr);
	for(int st:arr){
		System.out.print(st+" ");
	}
	
	
}
}
