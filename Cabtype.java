package com.Cab;

public class Cabtype {
	public static String cabName(String cabName)
	{
	if(cabName.equalsIgnoreCase("Mini") || cabName.equalsIgnoreCase("Micro") || cabName.equalsIgnoreCase("Prime"))
    {
    System.out.println("This car is Avaliable");
    }
    else
    {
    	System.out.println("This is not Available");
    }
	return cabName;

}
}
