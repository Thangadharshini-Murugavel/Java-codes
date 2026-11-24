package nineth_task;

import java.util.Scanner;

public class Pass {

	
public void validatePassword(String password) {
	if(password.length()<8) {
		throw new IllegalArgumentException("Password must contain at least 8 characters");
	}
	else {
		System.out.println("Valid password");
	}
}
public static void main(String[] args) {
	Pass ss = new Pass();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your password: ");
	String passs = s.nextLine();
	ss.validatePassword(passs);
	s.close();
	
}
}
