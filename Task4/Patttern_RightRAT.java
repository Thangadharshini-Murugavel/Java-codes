package loop;

public class Patttern_RightRAT {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {//5 rows
		for(int j=i+1; j<=5; j++) {
			System.out.print(" ");//spacing
		}
		for(int k=1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
