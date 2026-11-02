package loop;

public class Pattern_Down_LRAT {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {//5 rows
			for(int j=i; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
