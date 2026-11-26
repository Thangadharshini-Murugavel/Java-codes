package tenth_task;

import java.util.Scanner;

public class Student {
String Name;
int Rollno;
int Marks;

public void Details(String Name,int Rollno, int Marks) {
	System.out.println("Student Details-");
	System.out.println("NAME: "+Name);
	System.out.println("Rollno: "+Rollno);
	System.out.println("Marks: "+Marks);
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Student st = new Student();
	
	System.out.println("Enter your name: ");
	String Name = s.nextLine();
	
	System.out.println("Enter rollno: ");
	int Rollno = s.nextInt();
	
	System.out.println("Enter Marks: ");
	int Marks = s.nextInt();
	
	st.Details(Name, Rollno, Marks);
	
	s.close();
	 
	
}

}
