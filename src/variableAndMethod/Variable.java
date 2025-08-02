package variableAndMethod;

public class Variable {

	static String z;
	int i;
	int j=20;


	public void show() {
		i= 10;
		j= 20;
	//	System.out.println(z);	
		System.out.println(i);
		
	}
	
	public void add() {
		int result= i + j;
		System.out.println(result);
	}
	
	public void substract() {
		int K=170;
		int L=30;
		int result= K - L;
		System.out.println(result);
	}
	
     static public void multiply() {
		int a=30;
		int b=12;
		int result=  a * b;
		System.out.println(result);
	}
	 
	public void divide(int x, int y) {
		int result= x/y;
		System.out.println(result);
	}
	
	public static void main(String[] args)  {
	Variable variable= new Variable();
	 
	       System.out.println(z);
	       variable.show();
	       variable.add();
	       variable.substract();
	       multiply();
	       variable.divide(30, 2);
	       
	    
	}
	       

	}

