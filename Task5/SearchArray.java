package arraystringsfunctions;

import java.util.Scanner;

public class SearchArray {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no of elements in Array :");
	int n = s.nextInt();
	int arr[]= new int[n];
	for(int i=0; i<n; i++) {
		System.out.println("Enter the element:");
		arr[i] = s.nextInt();	
		}
	System.out.println("Enter the element to search");
	int search = s.nextInt();
	boolean found = false;
	for(int j=0; j<n; j++) {
		if(arr[j] == search) {
			found = true;
			System.out.println("Element found in index :"+j);
			break;
		}	
	}
	if(found==false){
		System.out.println("Element not found");
	}

}
}
