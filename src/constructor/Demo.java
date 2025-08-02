package constructor;

public class Demo {
	
	int i;
	String name;
	
	public Demo() {
		
		System.out.println("this is default contrutor,");
		
	}
	
	public Demo( int i) {
		System.out.println("this is contructor."); //overlonding
	}
	
	
	public void show() {
		
		System.out.println("value of i:---->"+i + "value of name:----"+name);
	}
     
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.show();
		
		Demo demo2=new Demo(10);
	}
}
