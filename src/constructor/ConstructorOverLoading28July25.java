package constructor;

public class ConstructorOverLoading28July25 {
	
	public ConstructorOverLoading28July25() {
		System.out.println("Its a default constructor");
	}
	
	public ConstructorOverLoading28July25(String comapanyName) {
		System.out.println("Its a Par. constructor");
	}
	
	public ConstructorOverLoading28July25(String comapanyName, String companyAddress) {
		System.out.println("Its a Par. constructor");
	}

	public static void main(String[] args) {
		ConstructorOverLoading28July25 obj=new ConstructorOverLoading28July25();
		ConstructorOverLoading28July25 obj2=new ConstructorOverLoading28July25("MAP");
		
	}
}
