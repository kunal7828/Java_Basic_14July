package methodsExample;



public class UserDefinedMethods {
	
	int i=10;
	static int j=20;
	
	public void show()
	{
		System.out.println("Its a non static method");
		System.out.println("Its show method output: "+i+"  "+j);
	}
	
	public void show(int i)//Method overloading
	{
		System.out.println("Its a non static method");
		System.out.println("Its show method output: "+i+"  "+j);
	}
	public void show(String i)
	{
		System.out.println("Its a non static method");
		System.out.println("Its show method output: "+i+"  "+j);
	}
	
	public static void display()
	{
		System.out.println("Its a static method");
		System.out.println("Its display method output:"+j);
	}

	public static void main(String[] args) {
		System.out.println("This is main block");
		display();
		UserDefinedMethods userDefinedMethods=new UserDefinedMethods();
		userDefinedMethods.show();
		
	}

}

