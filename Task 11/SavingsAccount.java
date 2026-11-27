package scenariobased;

import java.util.Scanner;

class  Bank{
	String Bank;
	String Name;
	int Bal;
	public void Account_Info(){
		System.out.println("Bank Name          : "+Bank);
		System.out.println("Account Holder Name: "+Name);
		System.out.println("Balance            : "+Bal);
		
	}
}

interface Loan{
	void Loan_Eligibilty();
}

public class SavingsAccount extends Bank implements Loan{
	
public void Loan_Eligibilty() {
		if(Bal>20000) {
			System.out.println("You're Eligible for Loan");
		}
		else {
			System.out.println("You're not Eligible for Loan");
		}
		
	}	

	
public static void main(String[] args) {
	
	SavingsAccount s = new SavingsAccount();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Bank Name: ");
	s.Bank = sc.nextLine();
	
	System.out.println("Account Holder Name: ");
	s.Name = sc.nextLine();
	
	System.out.println("Balance: ");
	s.Bal=sc.nextInt();
	
	s.Account_Info();
	s.Loan_Eligibilty();
	
	sc.close();
	
	
	
	
	
	
}



	
}

