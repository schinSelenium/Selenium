package javaprograms;

public class RemoveJunckCharachter {

	public static void main(String[] args) {
		String s = "hello 12345";
		//regular Expression 
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
