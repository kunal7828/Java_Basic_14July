package inheritance;

public class Demo1 {
	int i;
	int name;
	
	public Demo1() {
		System.out.println("Demo1 constructor");
	}
	
	public void show()
	{
		System.out.println("This is demo 1 class method.");
	}

	private void show2()
	{
		System.out.println("This is private method");
	}
	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
		
	}
}
	
	

