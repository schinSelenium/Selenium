package javaprograms;

import java.util.Scanner;

public class switchCase {
	
	public static void main(String[] args){
		int i;
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		switch(i)
		{
		case 1:
			System.out.println("One");
			break;
		case 2: 
			System.out.println("two");
			break;		
		case 3:
			System.out.println("three");
			break;
		case 4: 
			System.out.println("four");
			break;
			
		default : System.out.println("ANY VALUE");
		}
	}

}
