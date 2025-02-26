package com.l;

public class Square extends Rectangle
{
	public Square() {
	}	
	
	public Square(int s)
	{
		width = height =s;
	}
	
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	
	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setHeight(height);
	}
	
}
