package com.d;

//Dependency Inversion Principle (DIP)


import java.io.StringReader;
import java.io.StringWriter;

public class StringProcessor 
{
	private final StringReader stringreader;
	private final StringWriter stringWriter;
	
	public StringProcessor(StringReader stringreader, StringWriter stringWriter) 
	{
		
		this.stringreader = stringreader;
		this.stringWriter = stringWriter;
	}
	
	public void printString()
	{
		stringWriter.write(stringreader.toString());
	}
	
	

}
