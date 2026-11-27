package scenariobased;

class Student{
	private String Student_Name;
	private int Roll_no;
	private int Marks;

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.Student_Name = student_Name;
	}

	public int getRoll_no() {
		return Roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.Roll_no = roll_no;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.Marks=marks;
		}else {
			System.out.println("Invalid input");
		}
	}
	
}

public class Main {
public static void main(String[] args) {
	Student s = new Student();
	
	s.setStudent_Name("Priya");
	s.setRoll_no(105067);
	
	
	
	System.out.println("Student Name: "+s.getStudent_Name());
	System.out.println("Roll NO     : "+s.getRoll_no());
	s.setMarks(108);
	System.out.println("Marks       : "+s.getMarks());
	s.setMarks(83);
	System.out.println("Marks       : "+s.getMarks());
}
}
