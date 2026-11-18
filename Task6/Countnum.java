package functions;

import java.util.Scanner;

public class Countnum {
	
    void count(int num) {
	 int temp=Math.abs(num);
	 int c=0;
	 
	 if(num==0) {
		 c=1;
	 }
	 
	 while(temp>0) {
		 c++;
		 temp/=10;
	 }
	 
	 System.out.println(num+" is a "+c+" digit number" );
 }
    
public static void main(String[] args) {
	Countnum o = new Countnum();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number to find how many digits its have: ");
	int numb = s.nextInt();
	o.count(numb);
}
}
