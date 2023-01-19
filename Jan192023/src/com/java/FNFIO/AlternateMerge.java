package com.java.FNFIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AlternateMerge {

	public static void main(String[] args) {
		try
		{
			FileInputStream fis = new FileInputStream("Hello.txt");
			byte[] b1 = new byte[fis.available()];
			int length1 = fis.available();
			fis.read(b1);
			String s1 = new String(b1);
//			System.out.println(s1);
			
			FileInputStream fis1 = new FileInputStream("Test.txt");
			byte[] b2 = new byte[fis1.available()];
			int length2 = fis1.available();
			fis1.read(b2);
			String s2 = new String(b2);
//			System.out.println(s1);
			
			FileOutputStream fos = new FileOutputStream("Test1.txt");
			System.out.println(length1+" "+length2);
			System.out.println(s1);
			for(int i=0;i<length1 && i<length2;i++)
			{
				if(i%2==0)
					fos.write(b1[i]);
				else 
					fos.write(b2[i]);
			}
			
		}
		catch(IOException e)
		{
			
		}
	}

}
