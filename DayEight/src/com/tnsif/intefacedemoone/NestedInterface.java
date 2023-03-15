package com.tnsif.intefacedemoone;

public class NestedInterface implements MyInterface.MyInnerInterface
{

	@Override
	public void print() {
    System.out.println("Print method");		
	}

}
