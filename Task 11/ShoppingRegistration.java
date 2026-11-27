package scenariobased;

class Customer{
	String Name;
	int Mobile_Number;
	String Address;
	
	Customer(){
		Name = "UnKnown";
		Mobile_Number = 0;
		Address = "Unknown";		
	}
	
	Customer(String Name, int Mobile_Number){
		this.Name = Name;
		this.Mobile_Number = Mobile_Number;
		Address = "Unknown";	
	}
	
	Customer(String Name, int Mobile_Number, String Address){
		this.Name = Name;
		this.Mobile_Number = Mobile_Number;
		this.Address = Address;	
	}
	
	void display() {
		System.out.println("   Customer Details");
		System.out.println("========================");
		System.out.println("Name         : "+Name);
		System.out.println("Mobile Number: "+Mobile_Number);
		System.out.println("Address      : "+Address);
		System.out.println();
	}
	
	
}

public class ShoppingRegistration{
public static void main(String[] args) {
	Customer c1 = new Customer();
	Customer c2 = new Customer("Priya",21);
	Customer c3 = new Customer("Hema",22,"Ponnamapet, Salem");
	c1.display();
	c2.display();
	c3.display();
}

}
