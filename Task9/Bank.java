package nineth_task;

import java.util.Scanner;

class Bankk{ 
float bal = 50000;

	
	public void withdraw(float amt) {
		bal-=amt;
		System.out.println("Balance amount: "+bal);
	}
}

public class Bank extends Bankk{
	
	
	
	public void withdraw(float amt) {
		if (amt <= 0) {
		    throw new IllegalArgumentException("Enter a valid amount");
		}
		if(amt>bal) {
			throw new ArithmeticException("Insufficient balance!");
		}
		else {
			super.withdraw(amt);
		}
	}
public static void main(String[] args) {
	Bank b = new Bank();
	Scanner s = new Scanner(System.in);
	try {
	System.out.println("Enter your withdraw amount : ");
	float a = s.nextFloat();
	b.withdraw(a);
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
	finally {
		s.close();
	}
	
}
}
