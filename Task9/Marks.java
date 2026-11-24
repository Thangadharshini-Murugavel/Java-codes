package nineth_task;

import java.util.Scanner;

class InsufficientMarksException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InsufficientMarksException(String message){
		super(message);
	}
}



public class Marks {
	
	void checkmarks(int marks) throws InsufficientMarksException {
		if(marks < 35) {
			throw new InsufficientMarksException("Student failed! Minimum 35 marks required.");
		}
		else {
			System.out.println("Student passed!🥳");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Marks mm = new Marks();
		
		try {
			System.out.println("Enter your marks: ");
			int m = s.nextInt();
			mm.checkmarks(m);
			
		}
		catch(InsufficientMarksException e){
			System.out.println(e.getMessage());
		}
		finally {
			s.close();
		}
	}

}
