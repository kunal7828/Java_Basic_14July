package inheritance;

import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.Differentiating;

public class Combination extends Differentiating{
	
   public Combination(TypeDescription typeDescription) {
		super(typeDescription);
		// TODO Auto-generated constructor stub
	}
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
	   Combination combination=new Combination(null);
	   combination.addAndMul();
	   combination.mulAndDiv();
   }
}
