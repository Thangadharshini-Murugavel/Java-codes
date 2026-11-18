package functions;

public class Sequence1 {
	
		
		public static void series1(){
			for(int i=1; i<9; i++) {
				System.out.print((i*2)+" ");
			}}

		public static void series2() {
			for(int i=50; i>=0; i-=10) {
				System.out.print(i+" ");
			}
		}
		public static void main(String[] args) {
			Sequence1 g = new Sequence1();
			g.series1();
			System.out.println();
			g.series2();
		}
			
		}


