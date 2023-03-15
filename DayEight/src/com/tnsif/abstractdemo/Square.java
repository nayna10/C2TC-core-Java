package com.tnsif.abstractdemo;

public class Square extends Shape
{
	float side;
	

	
	//Default 
	public Square() {
		this.side = 2.0f;
	}



// Parametrized
	public Square(float side) {
		this.side = 2.0f;
	}




	@Override
	void calArea() 
	
	{
		area=side*side;
	}

}
