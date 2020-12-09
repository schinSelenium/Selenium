package javaprograms;

public class breckStastment {
	public static void main(String[] args)
	{
		int i = 1;		
		for (i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
			{
				System.out.println("found five brecking loop");
				break;
			}
			//System.out.println("after if complete");
		}
			System.out.println("out of loop");
			
	}

}
