package methodsExample;

public class MethodExampleWithReturn {
	
	static String name="MAP Quality Solutions";
	int i=10;
	int j=20;
	
	public static String getName()
	{
		System.out.println("This is getName method");
		return name;
		
	}

	public int add()
	{
		int result=i+j;
		return result;
	}
	
	public boolean validateHomePage()
	{
		boolean flag= webElement.isDisplayed();
		return flag;
	}
	
	public static void main(String[] args) {
	 String companyName=	MethodExampleWithReturn.getName();
	 System.out.println(companyName);
	 System.out.println(MethodExampleWithReturn.getName());
	 MethodExampleWithReturn methodExampleWithReturn=new MethodExampleWithReturn();
	int result2= methodExampleWithReturn.add();
	System.out.println(result2);
	}

}

