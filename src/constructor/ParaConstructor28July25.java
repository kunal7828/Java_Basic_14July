package constructor;

public class ParaConstructor28July25 {
	
	
	//Par. constructor
	public ParaConstructor28July25(String companyName) {
		name=companyName;
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
		System.out.println("its show display. "+name);
	}
	public static void main(String[] args) {
		ParaConstructor28July25 obj=new ParaConstructor28July25("MAP Quality Solutions");
		obj.display();

	}

}
