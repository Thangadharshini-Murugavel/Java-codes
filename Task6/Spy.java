package functions;

import java.util.Scanner;

public class Spy {
   void spynum(int num) {
	   int temp = num;
	   int sum = 0;
	   int pro = 1;
	   int digit;
	   
	   
	   while(temp>0) {
		   digit = temp%10;
		   sum+=digit;
		   pro*=digit;
		   temp/=10;  
	   }
	   
	   	   
	   if(sum==pro) {
		   System.out.println(num+" is a spy number");
	   }
	   else {
		   System.out.println(num+" is not a spy number");
	   }
	     
   }
   
   
   public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Spy y = new Spy();
	System.out.println("Enter any number to check it is spy number or not: ");
	int number = s.nextInt();
	y.spynum(number);
}
}
