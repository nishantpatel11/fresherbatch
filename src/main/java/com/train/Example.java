package com.train;

import com.train.utils.Armstrong;
import com.train.utils.CommonUtils;

public class Example {

	public static void main(String[] args) {

		System.out.println("Hello World");

		CommonUtils.printCommandLine(args);
		
		
		
		CommonUtils.printSortCommandLineArgs(args);


		Armstrong ob = new Armstrong(); 

		System.out.println("Armstrong number ::");
		for(int i=100;i<999;i++)
			if(ob.isArmstrong(i))
				System.out.println(" "+i); 

		System.out.println();
	}
}
