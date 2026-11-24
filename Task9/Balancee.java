package nineth_task;

import java.util.Scanner;

class MinimumBalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MinimumBalanceException(String message){
		super(message);
	}
}
public class Balancee {
	
	int bal = 5000;


void deposit(int amount) throws MinimumBalanceException{
		if(amount < 100) {
		throw new MinimumBalanceException("Minimum deposit amount is ₹100");
	}
	else {
		bal+=amount;
		System.out.println("Amount deposited Successfully");
		System.out.println("Balance :"+bal);
	}
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Balancee b = new Balancee();
	try {
		System.out.println("Enter your Deposit amount: ");
		int a = s.nextInt();
		b.deposit(a);
	}catch(MinimumBalanceException e) {
		System.out.println(e.getMessage());
	}finally {
		s.close();
	}
}
}
