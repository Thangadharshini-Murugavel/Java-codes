package arraystringsfunctions;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of array:");
		int l = s.nextInt();
		
		int[] arr = new int[l];
		for(int i=0; i<l; i++) {
			System.out.println("Enter the elements of array: ");
			arr[i]=s.nextInt();
		}
		
		System.out.print("Array elements are: ");
		for(int st:arr) {
			System.out.print(st+" ");
		}
		
		System.out.println();
		System.out.println("The Duplicate elements are: ");
		for(int i = 0; i < arr.length; i++) {

		    boolean found = false;

		    for(int k = 0; k < i; k++) {
		        if(arr[i] == arr[k]) {
		            found = true;
		            break;
		        }
		    }

		    if(found) {
		        continue;
		    }

		    for(int j = i + 1; j < arr.length; j++) {
		        if(arr[i] == arr[j]) {
		            System.out.print(arr[i] + " ");
		            break;
		        }
		    }
		}
		
		
	}
}
