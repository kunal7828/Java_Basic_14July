package constructor;

public class DefaultConstructor28July25 {
	
	
	//Default constructor
	public DefaultConstructor28July25() {
		i=10;
		name="MAP Quality Solutions";
		System.out.println("This is a ConstructorExample1");
	}

	int i;
	String name;
	public void show()
	{
		System.out.println("its show method.");
	}
	
	public void display()
	{
		System.out.println("its show display."+i+" "+name);
	}
	public static void main(String[] args) {
		DefaultConstructor28July25 obj=new DefaultConstructor28July25();
		obj.display();

	}

}
