package javaprograms;

public class RevereseTheString {

	public static void main(String[] args) {

		
		//(1)Revere a string 
		String s = "ABCDE";
		int len = s.length();
		String rev = "";

		for (int i = 4; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		//(2)Revere a string
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}

}
