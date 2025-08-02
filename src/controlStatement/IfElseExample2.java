package controlStatement;

public class IfElseExample2 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		int age=17;
		
		if (age>=18) {
			
			System.out.println("Person is eligible for the voating. Age is :"+age);
			
		}else {
			System.out.println("Person is not eligible for the voating because of his or her age: "+age);
		}
        System.out.println("Program end");
	}

}
