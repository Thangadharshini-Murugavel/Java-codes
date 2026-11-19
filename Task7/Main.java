package string_oops;


interface Animal{
	void makeSound();
}

class Dog implements Animal{
	public void makeSound() {
		System.out.println("Dog bark: Woof");
	}
}

class Cat implements Animal{
	public void makeSound() {
		System.out.println("Cat says: Meow");
	}
}

class Cow implements Animal{
	public void makeSound() {
		System.out.println("Cow says: Maahh");
	}
}


public class Main {
public static void main(String[] args) {
	Dog d=new Dog();
	Cat c=new Cat();
	Cow m=new Cow();
	d.makeSound();
	c.makeSound();
	m.makeSound();
}
}
