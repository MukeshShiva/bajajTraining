package com.java.FNFIO;
import java.io.*;

public class FNFException {

	public static void main(String[] args) throws IOException {
		File file = new File("Hello.txt");
//		if(file.createNewFile())
//		{
//			System.out.println("Created");
//		}
//		else
//		{
//			System.out.println("No");
//		}	
		if (file.exists())
		{
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.length());
			while(file.hasNextLine())
			{
				System.out.println(file.nextLine());
			}
		}
		else
		{
			throw new FileNotFoundException();
		}
	}

}
