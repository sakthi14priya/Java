package com.Cab;

public class Login {

	public static String mobileno(String mobileno)
	{
		if(mobileno.length() == 10)
		{
			System.out.println("The Mobile No is Valid");
		}
		else
		{
			System.out.println("The Mobile No is Invalid");
		}
		return mobileno;
	}
		
		public static String password( String password)
		{
		
		if (password.length()==8)
		{
		System.out.println("This Login page is Suceesfully Submitted...");	
		}
		else
		{
			System.out.println("The password is invalid");
			
		}
		return password;

		
	}
}