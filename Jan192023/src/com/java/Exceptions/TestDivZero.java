package com.java.Exceptions;

public class TestDivZero
{
	public void divZero(int num1,int num2)
	{
		try
		{
			if(num2==0)
			{
				throw new DivideByZeroException("Div zero");
			}
			else
			{
				System.out.println(num1/num2);
			}
		}
		catch(DivideByZeroException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Done with Finally");
		}
	}
}
