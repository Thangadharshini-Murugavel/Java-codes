package scenariobased;

abstract class ATM{
	double bal = 50000;
	abstract void withdrawal(double amt);
	abstract void  deposit(double amt);
}

class SBIATM extends ATM{

	@Override
	void withdrawal(double amt) {
		bal-=amt;
		System.out.println("Account Balance: "+bal);
		
	}

	@Override
	void deposit(double amt) {
		bal+=amt;
		System.out.println("Account Balance: "+bal);
		
	}
	
}
	
public class Bannkk{
	public static void main(String[] args) {
		SBIATM s = new SBIATM();
		s.deposit(55000);
		s.withdrawal(500);
		
		
	}
}
	
	


