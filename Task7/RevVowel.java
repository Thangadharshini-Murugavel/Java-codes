package string_oops;

import java.util.Scanner;

public class RevVowel {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter any word: ");
	String word = s.nextLine();
	
	
	System.out.print("The rev word: ");
	for(int i=word.length()-1; i>=0; i--) {
		System.out.print(word.charAt(i));
	}
	
	int count = 0;
	char[] arr = {'a','e','i','o', 'u','A','E','I','O','U' };
	for(int j=0; j<word.length(); j++) {
		for(int k=0; k<arr.length; k++) {
			if(word.charAt(j)==arr[k]) {
				count++;
			}
		}
	}
	System.out.println();
	System.out.println("The vowel count is "+count);
}
}
