package exceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		 try{    
             int a[]=new int[5];    
             a[5]=10/2;    
            }    
            catch(ArithmeticException e)  
               { 
            
                System.out.println("Arithmetic Exception occurs"); 
            	
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs"); 
              // System.exit(0);
               }    
            catch(Exception e)  
               {  
            	
                System.out.println("Parent Exception occurs");  
               }
		finally {
				System.out.println("Finally block");
			}           
            System.out.println("rest of the code");    

	}
}
