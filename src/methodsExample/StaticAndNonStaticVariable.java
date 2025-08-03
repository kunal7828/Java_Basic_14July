package methodsExample;

public class StaticAndNonStaticVariable {
	
	int i=10;
	static int j=20;
	
	public void show()
	{
		System.out.println(++i);
		System.out.println(++j);
	}

	public static void main(String[] args) {
		StaticAndNonStaticVariable staticAndNonStaticVariable=new StaticAndNonStaticVariable();
		staticAndNonStaticVariable.show();
		StaticAndNonStaticVariable staticAndNonStaticVariable2=new StaticAndNonStaticVariable();
		staticAndNonStaticVariable2.show();
		StaticAndNonStaticVariable staticAndNonStaticVariable3=new StaticAndNonStaticVariable();
		staticAndNonStaticVariable3.show();
	}

}


