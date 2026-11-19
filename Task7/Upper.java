package string_oops;

import java.util.Scanner;

public class Upper {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter a sentence: ");
	String word = s.nextLine();
	
	word = word.toUpperCase();
	
	String[] arr = word.split(" ");
	
	for(int i =0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	
}
}
