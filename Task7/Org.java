package string_oops;

class Employee{
	private String name;
	private int id;
	private double salary;
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public void setSalary(double salary) {
		this.salary= salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSalary() {
		return salary;
	}
}


public class Org {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setName("Mohith");
	e.setId(101101);
	e.setSalary(4500000);
	
	System.out.println("Employee details-");
	System.out.println();
	System.out.println("Name   :"+e.getName());
	System.out.println("ID     :"+e.getId());
	System.out.println("Salary :"+e.getSalary());
	
	
	
}
}
