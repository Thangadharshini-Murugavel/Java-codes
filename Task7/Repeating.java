package string_oops;

import java.util.Scanner;

public class Repeating {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter any word: ");
	String word = s.nextLine();
	System.out.print("Enter any letter: ");
	char c = s.next().charAt(0);
	int count = 0;
	for(int i=0; i<word.length(); i++) {
		if(word.charAt(i)==c) {
			count++;
		}
	}
	System.out.println("The number of "+c+" present in "+word+" is "+count);
	
}
}
