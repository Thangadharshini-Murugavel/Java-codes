package arraystringsfunctions;

import java.util.Scanner;

public class Max_Min {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the length of array: ");
	int len = s.nextInt();
	int[] arr = new int[len];
	for(int i=0; i<len; i++) {
		System.out.println("Enter the element: ");
		arr[i]=s.nextInt();
	}
	int min = arr[0];
	int max = arr[0];
	for(int j=1; j<len; j++) {
		if(arr[j]>max) {
			max=arr[j];
		}
		if(arr[j]<min) {
			min=arr[j];	
		}
	}
	
	System.out.println("The Maximum value: "+max);
	System.out.println("The Minimum value: "+min);
}}

