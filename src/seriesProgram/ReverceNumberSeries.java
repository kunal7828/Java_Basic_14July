package seriesProgram;

public class ReverceNumberSeries {
public void numberReverce() {
	for (int i = 1; i <= 5; i++) {
		
		for (int j = 5; j >= i; j--) {
			
			System.out.print(j+" ");
			
		}
		
		System.out.println();
	}

	
}
	public static void main(String[] args) {
		ReverceNumberSeries obj=new ReverceNumberSeries();
		obj.numberReverce();
	}

}
