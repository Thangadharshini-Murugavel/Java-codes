package functions;

import java.util.Scanner;

public class Laptop {
void Input() {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter your laptop price: ");
	double price = s.nextDouble(); 
	calculateCharge (price);
	s.close();
	
}

void calculateCharge (double price) {
	double discount;
	if(price<=50000) {
		discount=0;
	}
	else if(price<=100000) {
		discount= price * 10 / 100;
	}
	else if(price<=150000) {
		discount= price * 15 / 100;
	}
	else {
		discount= price * 20 / 100;
	}
	
	double finalprice = price-discount;
	System.out.print("Discount: "+discount);
	System.out.println();
	System.out.println("Final price: "+finalprice);
}

public static void main(String[] args) {
	Laptop l = new Laptop();
	l.Input();
	
}
}
