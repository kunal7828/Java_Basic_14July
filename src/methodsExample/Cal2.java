package methodsExample;

public class Cal2 {
	
	//Global variable with in a program or overall the class we can use
	
	int res=20;
	static int res2=30;
	
	
	public int add(int fv, int sv) // instance method
	
	{
		
		int result=fv+sv;       
		
		return result;
		
	
		
	//	basic program for multiplication sub and division???? home work fro today
		
		

	}

}

/*

✅ How to fix it:
1️⃣ Option A: Change method to return int

public int add(int fv, int sv) { // method returns int
    int result = fv + sv;       
    return result; // returning int is now valid
}
2️⃣ Option B: Keep it void and print or use the result

public void add(int fv, int sv) { // method returns nothing
    int result = fv + sv;       
    System.out.println("Sum is: " + result); // or do something else
    // No return statement needed in void method
}



*/