package exceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {

		int arr[] = { 0,1, 2, 3 };

		
		try {
			System.out.println(arr[4]);
			
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Index Out Of Bounds Exception class catch block");
		} catch (Exception a) {
			System.out.println("Exception class catch block");
		}
	
		System.out.println("Rest of the code");}
}

