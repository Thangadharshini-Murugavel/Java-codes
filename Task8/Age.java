package exceptionandfilehandling;

import java.util.Scanner;

public class Age {
	
public  void checkAge(int age) {
	if(age<18) {
		throw new IllegalArgumentException("Age must be 18 or above");
	}
	else {
		System.out.println("you are eligible to vote");
	}
		
	}
public static void main(String[] args) {
	Age a = new Age();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your Age :");
	int ag = s.nextInt();
	a.checkAge(ag);
	s.close();
}
}
