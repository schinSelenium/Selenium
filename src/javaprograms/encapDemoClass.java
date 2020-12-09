package javaprograms;

public class encapDemoClass extends encapDemo {
	public static void main (String[] args){
		encapDemo now = new encapDemo();
		//now.setAge(32);
		now.setFlag(true);
		//now.setName("Sachin");
		
		System.out.println("Nane is "+ now.getName());
		System.out.println("Age is "+ now.getAge());
		System.out.println("Falg is "+ now.getFlag());
	}

}
