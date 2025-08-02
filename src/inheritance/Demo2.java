package inheritance;

import constructor.Demo;

public class Demo2 extends Demo1{
	
	public Demo2() {
		System.out.println("Demo2 constructor");
	}
	public void display()
	{
		System.out.println("This is demo 2 class method.");
	}

	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		demo.display();
		demo.show();
		
	

	}

}

