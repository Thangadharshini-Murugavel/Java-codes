package string_oops;

public class Car {
String make;
String model;
int year;
public static void main(String[] args) {
	Car c1 = new Car();
	c1.make="Toyoto";
	c1.model="c123";
	c1.year=2025;
	System.out.println("Make :"+c1.make);
	System.out.println("Model:"+c1.model);
	System.out.println("year :"+c1.year);

}
}
