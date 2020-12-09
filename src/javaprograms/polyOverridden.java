package javaprograms;

public class polyOverridden {
	
	public void display()
	{
		System.out.println("working on polyOverridden");
				
	}
	public static void main(String[] arr)
	{
		polyOverridden polyOverridden = new polyOverridden();
		polyOverridden.display();
		subClass sublass = new subClass();
		sublass.display();
		
	}

}

class subClass extends polyOverridden
{
	public void display()
	{
		System.out.println("working on subclass");
	}
	
	
}

