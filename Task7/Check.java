package string_oops;

public class Check{
	void check(String str , char ch ) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("The number of "+ch+" present in "+str+" is "+count);
	}
	
	void check(String s1) {
		s1=s1.toLowerCase();
		char[] arr = {'a','e','i','o','u'};
		System.out.print("The vowels are :");
		for(int i=0; i<s1.length(); i++) {
			for(int j=0; j<arr.length; j++) {
				if(s1.charAt(i)==arr[j]) {
					System.out.print(" "+s1.charAt(i));
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Check c = new Check();
		c.check("Apple", 'p');
		c.check("Apple");
	}
}


