package functions;



public class Split {
	
	public void splitDigits(int a) {
	    String str = Integer.toString(Math.abs(a));
	    for (int i = 0; i < str.length(); i++) {
	        System.out.print(str.charAt(i)+" ");
	    }
	}

	public static void main(String[] args) {
		Split st = new Split();
		st.splitDigits(54321);
		

	}

}
