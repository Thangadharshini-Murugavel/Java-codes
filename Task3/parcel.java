package third_Task;
import java.util.Scanner;
public class parcel {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Weight of parcel (in gm):");
	int w = s.nextInt();
	System.out.println(" O-Ordinary \n E-Express \n Enter Booking Type: ");
	char b = s.next().charAt(0);
	if(b!='o'&& b!='O'&& b!='e'&& b!='E') {
		System.out.println("Invalid Input");
	}
	else if(w<100) {
		if(b =='o'|| b=='O') {
			System.out.println("The charge for Ordinary booking for "+w+"gms is 80 Rupees");
		}
		else if(b =='e'|| b=='E') {
			System.out.println("The charge for Express booking for "+w+"gms is 100 Rupees");;
		}	
	}
	else if(w<=500) {
		if(b =='o'|| b=='O') {
			System.out.println("The charge for Ordinary booking for "+w+"gms is 150 Rupees");
		}
		else if(b =='e'|| b=='E') {
			System.out.println("The charge for Express booking for "+w+"gms is 200 Rupees");;
		}	
	}
	else if(w<=1000){
		if(b =='o'|| b=='O') {
			System.out.println("The charge for Ordinary booking for "+w+"gms is 210 Rupees");
		}
		else if(b =='e'|| b=='E') {
			System.out.println("The charge for Express booking for "+w+"gms is 250 Rupees");;
		}	
	}
	else if(w>1000) {
		if(b =='o'|| b=='O') {
			System.out.println("The charge for Ordinary booking for "+w+"gms is 250 Rupees");
		}
		else if(b =='e'|| b=='E') {
			System.out.println("The charge for Express booking for "+w+"gms is 300 Rupees");;
		}	
	}	
	}
}
