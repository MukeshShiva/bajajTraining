package com.java.FNFIO;

public class MultipleCatches {

	public static void main(String[] args) {
		try
		{
			int num1 = 36;
			int num2 = 0;
			int[] arrayA = new int[2];
//			System.out.println(num1/num2);	
			System.out.println(arrayA[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Dont access elements out of array");
		}
	}

}
