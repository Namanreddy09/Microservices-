package com.l;

public class Demo 
{
	static void getArea(Rectangle r)
	{
		int width =r.getWidth();
		r.setWidth(5);
		System.out.println("Expected area of"+(width *10)  + ", got"+ r.getArea());
		
	}

	public static void main(String[] args)
	{
		Rectangle rt= new Rectangle(4,5);
		getArea(rt);
		
		Rectangle s=new Square();
		s.setWidth(4);
		getArea(s);
		

	}

}
