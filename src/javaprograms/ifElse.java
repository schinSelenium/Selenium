package javaprograms;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter Value : - 1");
		int a = sc.nextInt();
		
		if(a==1)
		{
			System.out.println("One");                                  
		}
		else if (a==2) {
			System.out.println("Two");                                  
		}
		else if (a==3) {
			System.out.println("Three");                                  
		}
		else{
			System.out.println("Hello " +"hi");   
		}
	}

}
