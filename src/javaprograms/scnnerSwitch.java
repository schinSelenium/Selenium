package javaprograms;

import java.util.Scanner;

public class scnnerSwitch
	{
	public static void main(String[] args) 
	{
		char a; 
		int i = 0,j = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("enter a for addition"+  "\n" );
		System.out.println("enter b for sub"+ "\n");
		System.out.println("enter c for exit" + "\n");
		a = sc.next().charAt(0);
		
			switch(a) 
			{
			case 'a' :
				System.out.println("Enter Two Values for Add ");
				i = sc.nextInt();
				j = sc.nextInt();
				System.out.println("your ans is    "  + (i+j) + "\n"); 
				break;
			case 'b' :
				System.out.println("Enter Two Values for Sub ");
				i = sc.nextInt();
				j = sc.nextInt();
				System.out.println("your ans is    "  + (i-j) + "\n");
				System.out.println();
				break;
			case 'c' :
				System.out.println("Thank You");
				break;
			default : System.out.println("Are you MAD!!!!" + "\n");
			}
		}while(a!='c');
		
	}
	}
		
