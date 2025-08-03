package methodsExample;

public class Cal {
	
	//Global variable with in a program or overall the class we can use
	
	int res=20;
	static int res2=30;
	
	
	public void add(int fv, int sv) // instance method
	
	{
		
		int result=fv+sv;               //  local variable with in a class or with in a body
		
		
		System.out.println("addition of two number"+result);
	}
	

	
public void add() //without parameterized
	
	{
		
		int result=10+20;
		
		
		System.out.println("addition of two number"+result);
	}
	
	public static void show()              // instance methods -static methods
	{
		System.out.println("It is static method");
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Cal cal=new Cal();
		cal.add(0, 0);

     
		
		
		
	//	main function directly jvm call karta hai
		// static at the time of class load memory allocates
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
