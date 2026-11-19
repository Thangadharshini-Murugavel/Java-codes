package string_oops;

abstract class BankAccount {
	double bal = 10000;
	abstract void Deposit(double amt);
	abstract void Withdraw(double amt);
}

class SavingsAccount extends BankAccount{

	@Override
	void Deposit(double amt) {
		bal+=amt;
		System.out.println("Saving Deposits :"+bal);
	}

	@Override
	void Withdraw(double amt) {
		bal-=amt;
		System.out.println("Savings Withdraw :"+bal);
		
	}
	
}

class CheckingAccount extends BankAccount{

	@Override
	void Deposit(double amt) {
		bal+=amt;
		System.out.println("checking Deposits :"+bal);
	}

	@Override
	void Withdraw(double amt) {
		bal-=amt;
		System.out.println("checking Withdraw :"+bal);
		
	}
	
}
public class Mainn {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.Deposit(5000);
		s.Withdraw(2000);
		
		CheckingAccount c = new CheckingAccount();
		c.Deposit(50000);
		c.Withdraw(2000);
	}
}
