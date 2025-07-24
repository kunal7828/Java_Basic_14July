package methodsExample;

public class MethodsFirstProgram2 {
	
	
	int i=16;
	
	static int j=37;
	
	public void show() //instance method also known as create objects.
	{
		System.out.println("Its show instance method or non static method");
		System.out.println(i + " " + j);
	}
	
	static void show2() //static method no need to create object for accessing this method not mandatory..
	{
		
		System.out.println("Its show 2 static method.");
//		System.out.println(i + " " + j);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsFirstProgram2 obj= new MethodsFirstProgram2();
		obj.show();
		MethodsFirstProgram2.show2(); 
		show2();
		
		//static method only static variable access kar skti h non static variable se deal nhi karti 
		//non static method dono type ke variable access kar skti h static and non static

	}

}
