package scenariobased;

class  UPI extends Payment{
	@Override
	public void makePayment(){
		System.out.println("UPI Payment Successfully Completed");
	}
}
class  Card extends Payment{
	@Override
	public void makePayment(){
		System.out.println("Card Payment Successfully Completed");
	}
}
class NetBanking extends Payment{
	@Override
	public void makePayment(){
		System.out.println("NetBanking Payment Successfully Completed");
	}
}

public class Payment {
	
public void makePayment() {
	System.out.println("Payment Details");
}

public static void main(String[] args) {
	Payment p;
	
	p=new UPI();
	p.makePayment();
	
	p=new Card();
	p.makePayment();
	
	p=new NetBanking();
	p.makePayment();
	
}


}
