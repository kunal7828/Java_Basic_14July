package classAndObject;

public class Demo {
	int firstValue=10;
	int secondValue=20;
	
	public Demo(int i) {
		System.out.println("Demo Contrucoter");
	}
	
	public int add() {
		System.out.println(firstValue+secondValue);
		return 0;
	}
	
	public void show() {
		System.out.println("MAP");
	}
    
	public static void main(String[] args) {
		
		Demo demo=new Demo(10);
		demo.add();
		demo.show();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
}
