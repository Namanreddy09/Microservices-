package com.i;

public class Main 
{
	public static void displayVegetarianMenu(IMenu menu) 
	{
        System.out.println("Vegetarian Menu:");
        for (String item : menu.getVegetarianItems())
        {
            System.out.println("- " + item);
        }
    }

    public static void displayNonVegetarianMenu(IMenu menu) 
    {
        System.out.println("Non-Vegetarian Menu:");
        for (String item : menu.getNonVegetarianItems()) 
        {
            System.out.println("- " + item);
        }
    }
    public static void displayDrinkMenu(IMenu menu) 
    {
        System.out.println("Drink Menu:");
        for (String item : menu.getDrinkItems()) 
        {
            System.out.println("- " + item);
        }
    }
    
    
	public static void main(String[] args)
	{
		IMenu m = new IMenu();

        displayVegetarianMenu(m);
        displayNonVegetarianMenu(m);
        displayDrinkMenu(m);

	}

}
