package tenth_task;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter a year to find whether it is leap year or not: ");
	int year = s.nextInt();
	if(year%400==0) {
		System.out.println(year+" is a Leap year");
	}else if(year%100==0) {
		System.out.println(year+" is not a Leap year");
	}else if(year%4==0) {
		System.out.println(year+" is a Leap year");
	}else {
		System.out.println(year+" is not a Leap year");
	}
	s.close();
}
}
