package methodsExample;

public class MethodsFirstProgram {
	
	void show() //instance method also known as create objects.
	{
		
		System.out.println("Its show instance method or non static method");
	}
	
	static void show2() //static method no need to create object for accessing this method not mandatory..
	{
		
		System.out.println("Its show 2 static method.");
	}
	
	void enterName(String mapValue)
	{
		
		System.out.println(mapValue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsFirstProgram obj= new MethodsFirstProgram();
		obj.show();
		MethodsFirstProgram.show2(); //class name se access kar skte h object create kane ki jarurat nhi h static method ke liye
		show2();
		//other class me call karne ke liye static method ke class name ke sath call karege
		//method name or class name dono se access kar skte ho object create karne ki jarurat nhi hai static method me
		obj.enterName("Map Quality Solutions");

	}

}
