package scenariobased;

class Addition{
	
	public void add(int a, int b) {
		System.out.println("The sum: "+(a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("The sum: "+(a+b+c));
	}
	
	public void add(double a, double b) {
		System.out.println("The sum: "+(a+b));
	}
	
	public void add(int a, double b) {
		System.out.println("The sum: "+(a+b));
	}
	
}

public class Calculator extends Addition{
public static void main(String[] args) {
	Calculator c = new Calculator();
	
	c.add(15,20);
	c.add(15.2, 45.8);
	c.add(15, 45, 44);
	c.add(5,5.6);
	
	
}
}
