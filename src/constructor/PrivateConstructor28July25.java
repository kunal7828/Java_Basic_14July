package constructor;

public class PrivateConstructor28July25 {
	
	
	//Private. constructor
	private PrivateConstructor28July25(String companyName) {
		name=companyName;
		System.out.println("This is a ConstructorExample1");
	}

	int i;
	String name;
	public void show()
	{
		System.out.println("its show method.");
	}
	
	public static void display()
	{
		System.out.println("its show display. ");
	}
	public static void main(String[] args) {
		PrivateConstructor28July25 obj=new PrivateConstructor28July25("MAP Quality Solutions");
		obj.display();

	}

}
