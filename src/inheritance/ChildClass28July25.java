package inheritance;

public class ChildClass28July25 extends ParentClass28July25{
	
	public void display()
	{
		System.out.println("Its a child class display method.");
	}

	public static void main(String[] args) {
	ChildClass28July25 childClass=new ChildClass28July25();
	childClass.display();
	//ParentClass parentClass=new ParentClass();
	//parentClass.show();
	childClass.show();
	childClass.circle();

	}

}
