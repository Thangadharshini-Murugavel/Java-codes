package string_oops;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any word: ");
		String word = s.nextLine();
		char[] arr = {'a','e','i','o', 'u','A','E','I','O','U' };
		int count = 0;
		System.out.print("The vowels are: ");
		for(int i=0; i<word.length(); i++) {
			for(int j=0; j<arr.length; j++) {
				if(word.charAt(i)==arr[j]) {
					count++;
					System.out.print(word.charAt(i)+" ");
					
				}
			}
		}
		System.out.println();
		System.out.println("The number of  vowels present: "+count);
		
	}
}
