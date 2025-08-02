package inheritance;

public class Combination extends Different{
	
   public void addandSub() {
	System.out.println(54+7-22);
	
}
   public void mulAndDiv() {
	   System.out.println(2*34/2);
	
}
   public void addAndMul () {
	System.out.println(12+23*4);
}
   public static void main(String arg[]) {
	   Combination combination=new Combination();
	   combination.addAndMul();
	   combination.mulAndDiv();
   }
}
