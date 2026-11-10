package arraystringsfunctions;
import java.util.Scanner;

public class Larg_Small_Sum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int arr[] = new int [20];
		System.out.println("The fixed length of array is 20");
	for (int i=0; i<arr.length; i++) {
		System.out.println("Enter your element: ");
		arr[i] = s.nextInt();
	}
	int min = arr[0];
	int max = arr[0];
	int tot = 0;
	for (int j=0; j<arr.length; j++) {
		if(arr[j]>max) {
			max=arr[j];
		}
		if(arr[j]<min) {
			min=arr[j];
		}
		
	}
	for(int k=0; k<arr.length;k++) {
		tot+=arr[k];
	}
	
	System.out.println("The largest number in array: "+max);
	System.out.println("The smallest number in array: "+min);
	System.out.println("The sum of  array: "+tot);
	
}
}
