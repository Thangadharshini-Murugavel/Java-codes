package loop;

public class Pattern_Rhombus {
public static void main(String[] args) {
	for(int i=1; i<=3; i++) {
		for(int j=i+1; j<=3; j++) {
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1; i<=3; i++) {
		for(int k=1; k<=i; k++) {
			System.out.print(" ");
		}
		for(int j=i+1; j<=3; j++) {    
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
