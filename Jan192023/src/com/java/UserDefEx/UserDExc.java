package com.java.UserDefEx;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class UserDExc {

	public static void main(String[] args) {
		System.out.print("Enter the age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try
		{
			ageCheck(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void ageCheck(int age) throws InvalidAgeException
	{
		if(age < 19)
		{
			throw new InvalidAgeException("Age Lesser than 19");
		}
		else
		{
			System.out.println("Accepted");
		}
	}

}
