package exceptionandfilehandling;

import java.util.Scanner;

public class Arrayout {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] arr = new int[5];
	System.out.println("Enter array elements capacity(5) ");
	
	for(int i=0; i<arr.length; i++) {
		System.out.println("Enter element: ");
		arr[i]=s.nextInt();
	}
	
	try {
		System.out.println("Enter index to access your array : ");
		int index = s.nextInt();
		
		System.out.println("Element is :"+arr[index]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index! Please enter an index between 0 and 4.");
	}finally {
		s.close();
	}
}
}
