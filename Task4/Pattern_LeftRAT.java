package loop;

public class Pattern_LeftRAT {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {//5 rows
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
