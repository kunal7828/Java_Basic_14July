package inheritance;

public class ChildClass extends ParentClass{
	
	public void display()
	{
		System.out.println("Its a child class display method.");
	}

	public static void main(String[] args) {
	ChildClass childClass=new ChildClass();
	childClass.display();
	//ParentClass parentClass=new ParentClass();
	//parentClass.show();
	childClass.show();
	childClass.circle();

	}

}
