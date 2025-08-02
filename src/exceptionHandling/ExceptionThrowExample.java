package exceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionThrowExample {
	 public static void validate(int age) { 
	    	try {
	    		 if(age<18) {  
	    	            throw new FileNotFoundException("Person is not eligible to vote");    
	    	        }  
	    	        else {  
	    	            System.out.println("Person is eligible to vote!!");  
	    	        } 
			} catch (Exception e) {
			System.out.println("Test"+e);
			}
	        
	    }  
	    public static void main(String args[]){  
	    	
	    		 validate(18);  
			
	       
	        System.out.println("rest of the code...");    
	  }   
}
