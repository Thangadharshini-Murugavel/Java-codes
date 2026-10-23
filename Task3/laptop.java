package third_Task;

import java.util.Scanner;

public class laptop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your Laptop price to find discount: ");
		int p = s.nextInt();
		if(p<50000) {
			System.out.println("No discount");
		}
		else if(p<=100000) {
			System.out.println("Price of Laptop:"+p);
			int d = 10*p/100;
			System.out.println("Discount:"+d);
			System.out.println("Total price:"+(p-d));
		}
		else if(p<=150000) {
			System.out.println("Price of Laptop:"+p);
			int d = 15*p/100;
			System.out.println("Discount:"+d);
			System.out.println("Total price:"+(p-d));
		}
		else if(p>150000) {
			System.out.println("Price of Laptop:"+p);
			int d = 20*p/100;
			System.out.println("Discount:"+d);
			System.out.println("Total price:"+(p-d));
		}
		
	}

}
