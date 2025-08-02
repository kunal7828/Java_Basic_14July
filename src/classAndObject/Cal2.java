package classAndObject;

public class Cal2 {
	
	public void sin()
	{
		System.out.println("Sin");
	}

	public static void main(String[] args) {
		Cal cal=new Cal();
		int resultData=cal.add();
		System.out.println("resultData--->"+resultData);
		
		System.out.println(cal.getName());
		
	}

}
