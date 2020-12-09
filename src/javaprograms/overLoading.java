package javaprograms;

public class overLoading extends shape{

	public static void main(String[] args) {
		Sum obj = new Sum();
		obj.addition(12,111);
		obj.addition(12.0,13.0,33.0);		

		// calling static function
		Sum.addition(1, 2, 3);
		
		shape obj1;
		
		obj1 = new rectangle();
		obj1.draw();
		
	}

}

class Sum
{
	
	public void addition(int i, int j)
	{
		System.out.println("addition of two integers - "+(i+j));
	}
	
	public void addition(double d, double e, double f) {
		System.out.println("addition of two integers - "+(d+e+f));
		
	}

	public void addition(float i, float j)
	{
		
		System.out.println("addition of two float - "+(i+j));
	}
	public void addition(float i, float j, float k)
	{
		System.out.println("addition of two float - "+i+j+k);
	}
	
	static void addition(int i, int j, int k)
	{
		System.out.println("addition of two float - "+(i+j+k));
	}
}
