package tenth_task;

import java.util.Scanner;

public class Stringpalindrome {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter a word: ");
	String word = s.nextLine();
	
	
	int len = word.length();
	String temp = "";
	
	for(int i=len-1; i>=0; i--) {
		temp += word.charAt(i);
	}
	
	if(word.equals(temp)) {
		System.out.println(word+" is palindrome");
	}
	else {
		System.out.println(word+" is not a palindrome");
	}
	
	
	
	
	
	
	s.close();
}
}
