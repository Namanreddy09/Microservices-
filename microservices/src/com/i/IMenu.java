package com.i;

import java.util.Arrays;
import java.util.List;

public class IMenu implements Menu
{

	@Override
	public List<String> getVegetarianItems()
	{
		
		return Arrays.asList("Vegetable Curry", "Paneer Tikka", "Salad");
	}

	@Override
	public List<String> getNonVegetarianItems()
	{
		return Arrays.asList("Chicken Curry", "Fish Fry", "Mutton Biryani");
	}

	@Override
	public List<String> getDrinkItems()
	{
		 return Arrays.asList("Water", "Soda", "Juice");
	}


}
