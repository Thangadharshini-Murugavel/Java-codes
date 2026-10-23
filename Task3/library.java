package third_Task;

import java.util.Scanner;

public class library {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of days were returned late:");
		int d = s.nextInt();
		if (d<6) {
			System.out.println("Fine :"+(d*40)+" Paise");
		}
		else if (d<11) {
			System.out.println("Fine :"+(d*65)+" Paise");
		}
		else {
			System.out.println("Fine :"+(d*80)+" Paise");
		}
		
	}

}
