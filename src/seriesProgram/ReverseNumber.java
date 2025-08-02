package seriesProgram;

public class ReverseNumber {

	public static void main(String[] args) {

		
		int n=123,r;
		while(n>0) {   //123greater 0 hai true then it execute the while statement 
			r=n%10;
			System.out.print(r);
			n=n/10;
			
		}
	}
}



