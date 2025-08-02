package controlStatement;

public class NestedIfElseExample4 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		String edu="BE";
		String twelthSubject="PCM";
		
		if (twelthSubject=="PCM") {
			
			if (edu=="BE") {
				int pre=59;
				if (pre>=60) {
					System.out.println("Eligible for Test. Degree Name: "+edu +" Pre is: "+pre);
				}else
				{
					System.out.println("Not Eligible for Test because of pre: "+pre);
				}
				
			}else if (edu=="MCA") {
				System.out.println("Eligible for Test. Degree Name: "+edu);
			}else if (edu=="BCOM") {
				System.out.println("Eligible for Test. Degree Name: "+edu);
			}else if (edu=="MBA") {
				System.out.println("Eligible for Test. Degree Name: "+edu);
			}else if (edu=="MSC") {
				System.out.println("Eligible for Test. Degree Name: "+edu);
			}else if (edu=="BA") {
				System.out.println("Eligible for Test. Degree Name: "+edu);
			}else {
				System.out.println("Not Eligible for Test. Degree Name: "+edu);
			}
			
		}else
		{
			System.out.println("Not eligible for test because of 12th subject : "+twelthSubject);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Program end");
		
}
}
