package string_oops;

import java.util.Scanner;

public class splitmax {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String word = s.nextLine();
	
	String[] arr = word.split(" ");
	
	String maxi = null;
	int max=0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i].length()>max) {
			max=arr[i].length();
			maxi= arr[i];
		}
	}
	
	System.out.println("The longest word = "+maxi);
}
}
