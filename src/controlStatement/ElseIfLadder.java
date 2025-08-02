package controlStatement;

public class ElseIfLadder {

	public void age(int num) {
	  
	  
	  
	if (18<num) {
		System.out.println("you are elegible for vote");
		}
		
		else if(17>num) {
			System.out.println("You are a kid");
		}
		
	 else {
System.out.println("Enter a valid Age - You are not eligible for voting Process.");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElseIfLadder eil = new ElseIfLadder();
		eil.age(13);
	}

}
