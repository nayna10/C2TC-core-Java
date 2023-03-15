package com.tnsif.exceptionsdemo;

public class UncheckedException {

	public static void main(String[] args) 
	{
    int x[];
    x=new int[] {1,2,3,4,5};
    
    
    try {
		System.out.println(x[9]);
		} 
    catch (ArrayIndexOutOfBoundsException e) {
    
          System.out.println("Enter correct index number "+e.getMessage());
    }
	System.out.println("Execution is successful");
		
		
	}

}
