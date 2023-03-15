package com.tnsif.trycatcdemo;

public class TryCatchDemo 

{
  static void divide(int x,int y)
  {
	  System.out.println("I am in a method");
	  int z;
	  
	   try 
	   {
	   System.out.println("I am in try block");
	   z=x/y;
	  System.out.println("Result of division is:"+z);
	   }
	   catch(ArithmeticException e)
	   {
		 
		   System.err.println("I am in catch block"+e.getMessage());
	   }
	   System.out.println("Execute me");

  }
	

}
