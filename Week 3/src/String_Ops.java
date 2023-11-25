
public class String_Ops {
	
	String str;
	
	public String_Ops(String str) {
		super();
		this.str = str;
	}

	
	public void showChar(int x) {
		System.out.println("the character at "+x+" is "+str.charAt(x));

}
	
	public void printEvenChar() {
		for(int i =0;i<str.length();i++) {
			if((i+1)%2==0) {
				System.out.print(str.charAt(i)+" ");
			}
		}
		
	}
	
	public void joinStr(String s1, String s2) {
		String s3 = s1.concat(s2);
		System.out.print(s3);
	}
	
	
	public void rev(String str) {
		String rstr="";
		for (int i =str.length()-1;i>=0;i--) {
			rstr= rstr +str.charAt(i);
		}
		System.out.print("The rev string is "+rstr);
		if(str.contentEquals(rstr)) {
			System.out.println("The string"+str+"is a Palendrome");
		}

	}
	
}
