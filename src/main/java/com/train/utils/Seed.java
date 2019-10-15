package com.train.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Seed {


	@SuppressWarnings("unchecked")
	public static void main(String [] args) {

		List<Integer> list = new ArrayList<Integer>();


		Random rnd = new Random(10);
		for(int i=10;i<=50;i+=5) {
			rnd.setSeed(i);
			for(int j=0;j<7;j++){
				int num =rnd.nextInt(100);
				if( list.size()<20)
					if( num>10 && num<50)
						list.add(num);
			}	
		}
		System.out.println("============= Print List ================");
		System.out.println(list);
		System.out.println("============= Initiate Sorted ArrayList ================");
		list.sort(new Comparator<Integer>() {
			public int compare(Integer x,Integer y) {

				if(x>y)
					return 1;
				if(x<y)
					return -1;
				return 0;
			}
		});
		
		System.out.println("Sorted Array is \n"+list);
		System.out.println("============= Initiate Object Serialized ================");
		
		
		
		String filename = "file.ser"; 
		try(FileOutputStream file = new FileOutputStream(filename); ObjectOutputStream out = new ObjectOutputStream(file); ){    

			out.writeObject(list); 
			System.out.println("Object has been serialized"); 
		} catch(IOException ex){
			
			System.out.println("IOException is caught"); 
		} 


		System.out.println("============= Initiate Object De-serialized ================");
		List<Integer> object1 = null; 
		try(FileInputStream file = new FileInputStream(filename); ObjectInputStream in = new ObjectInputStream(file);){    
			object1 = (List<Integer>) in.readObject(); 

			in.close(); 
			file.close(); 

			System.out.println("Object has been deserialized "); 
			System.out.println("a = " + object1); 
		} 

		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 

		catch(ClassNotFoundException ex) 
		{ 
			System.out.println("ClassNotFoundException is caught"); 
		} 



		System.out.println(list.size());
	}
}
