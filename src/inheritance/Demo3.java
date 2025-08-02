package inheritance;

public class Demo3 extends Demo2{
	public Demo3() {
		System.out.println("Demo3 constructor");
	}
	
	public void print()
	{
		System.out.println("This is demo2 class method");
	}

	public static void main(String[] args) {
		Demo3 demo=new Demo3();
		demo.print();
		demo.show();
		demo.display();
	}

}
