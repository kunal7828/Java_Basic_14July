package classAndObject;

public class Cal {
	
	static int fv=10;
	static int sv=20;
	static int result;
	
	public int add()
	{
		result=fv+sv;
		System.out.println("Result of addition:-->"+result);
		return result;
		
	}
	
	public String getName()
	{
		return "MAP Quality Solutions";
		
	}
	
	public static void mul()
	{
		result=fv*sv;
		System.out.println("Result of Mul:-->"+result);
		
	}

	public static void main(String[] map) {
		System.out.println("Program start");
		//Cal cal=new Cal();
		new Cal().add();
	//	cal.add();
	//	cal.mul();
	

	}

}
