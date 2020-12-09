package javaprograms;

public class RuntimePolymor {

	public static void main(String[] args) 
	{
		shape sh;
		
		sh = new shape();
		sh.draw();
		
		sh = new rectangle();
		sh.draw();
		
		sh = new traingle();
		sh.draw();
	
	}

}

class shape
{
	public void draw()
	{
		System.out.println("In shape draw");
	}
	
}


class rectangle extends shape
{
	public void draw()
	{
		System.out.println("In rectangle draw");
	}
}

class circle extends shape
{
	public void draw()
	{
		System.out.println("In circle draw");
	}
}

class traingle extends shape 
{
	public void draw()
	{
		System.out.println("In traingle draw");
	}
}