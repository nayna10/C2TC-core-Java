package com.tnsif.abstractdemo;

public class AbstractDemo {

	public static void main(String[] args) {

		
		Rectangle r=new Rectangle();
		r.calArea();
		r.show();
			
		
		Square s=new Square();
		s.calArea();
		s.show();
		
		System.out.println(".....Parametrized call........");
		
		Shape shape;
		
		shape=new Rectangle(10.0f,20.f);  //loose coupling/dynamic binding
		shape.calArea();
		shape.show();
		
		shape=new Square(10.4f);
		shape.calArea();
		shape.show();
		
		
	}

}
