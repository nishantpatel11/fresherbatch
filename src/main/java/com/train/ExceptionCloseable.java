package com.train;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionCloseable {


	public static void main(String[] args) throws IOException { 


		//		Closeable Example
		int ch; 

		FileReader fr=null; 
		try
		{ 
			fr = new FileReader("text"); 
			while ((ch=fr.read())!=-1) 
				System.out.print((char)ch); 

		} 
		catch (FileNotFoundException fe) 
		{ 
			System.out.println("File not found"); 
		}finally { 
			fr.close(); 
		}

		
		
		// Auto Closeable example
		String str = "File Handling in Java using "+ 
				" FileWriter and FileReader"; 

		try(FileWriter fw=new FileWriter("output.txt");){ 

			for (int i = 0; i < str.length(); i++) 
				fw.write(str.charAt(i)); 

			System.out.println("Writing successful"); 

		}catch(Exception e) {
			System.out.println(e.getMessage()); 
		}

	} 

}
