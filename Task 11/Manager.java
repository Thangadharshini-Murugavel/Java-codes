package scenariobased;

class Person{
	String Name = "Priya";
	int Age = 21;
	public void Person_Details() {
		System.out.println("   Personal Details");
		System.out.println("=======================");
		System.out.println("Name: "+Name);
		System.out.println("Age : "+Age);
		System.out.println();
	}
}

class Employee extends Person{
	int Employee_ID = 10102;
	double Salary = 125000;
	public void Employee_Details() {
		System.out.println("   Employee Details");
		System.out.println("=======================");
		System.out.println("Employee ID     : "+Employee_ID);
		System.out.println("Employee Salary : "+Salary);
		System.out.println();
	}
			
}

public class Manager extends Employee{
	String dept = "Software Development";
	int team_size = 45;
	public void Management_Details() {
		System.out.println("   Management Details");
		System.out.println("=======================");
		System.out.println("Department : "+dept);
		System.out.println("Team Size  : "+team_size);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Manager m = new Manager();
		m.Management_Details();
		m.Person_Details();
		m.Employee_Details();
	}

}
