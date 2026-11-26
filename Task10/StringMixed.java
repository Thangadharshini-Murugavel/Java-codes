package tenth_task;

import java.util.Scanner;

public class StringMixed {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = s.nextLine();
		
		int consonants = 0;
		int Space = 0;
		int Digit = 0;
		int vowels = 0;
		
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				Digit++;
			}
			if(Character.isWhitespace(ch)) {
				Space++;
			}
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'
					|| ch=='A'|| ch=='E' || ch=='I' || ch=='O'|| ch=='U') { 
				vowels++;
			}
			else if(Character.isLetter(ch)){
				consonants++;
			}
			
			
			
				
		}
		
		
		System.out.println("Consonants="+consonants);
		System.out.println("Vowels:"+vowels);
		System.out.println("Digits:"+ Digit);
		System.out.println("WhiteSpaces:"+Space);
		
		s.close();
	}
	}
