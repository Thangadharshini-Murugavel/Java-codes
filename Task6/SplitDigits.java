package functions;
import java.util.Scanner;
public class SplitDigits {
  void squareDigits(int num) {
	  int temp = num;
	  int count = 0;
	  int dig;
	  int sqr;
	  while(temp>0) {
		  count++;
		  temp/=10;
	  }
	  int[] arr = new int[count];
	  
	  temp=num;
	  for(int i=count-1; i>=0; i--){
		  dig = temp%10;
		  sqr = (int)Math.pow(dig,2);
		  arr[i]=sqr; 
		  temp/=10;
	  }
	  
	  for(int i=0; i<count; i++) {
		  System.out.print(arr[i]+" ");
	  }
  }
  
  public static void main(String[] args) {
	  SplitDigits obj = new SplitDigits();
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter any number to find the each digit square: ");
	  int numb = s.nextInt();
	  System.out.println();
	  obj.squareDigits(numb);
}
}
