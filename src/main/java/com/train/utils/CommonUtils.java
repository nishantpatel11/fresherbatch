package com.train.utils;

import java.util.Arrays;

public class CommonUtils {

	public static void printCommandLine(String [] args) {

		if(args.length<1)
			return ;

		Arrays.asList(args).stream().forEach(System.out::println);


	}


	public static void printSortArgs(String [] args) {

		if(args.length<1)
			return ;



		Arrays.parallelSort(args);
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);

	}

	public static void printSortCommandLineArgs(String [] args) {

		if(args.length<1)
			return ;

		String [] str = args[0].split(",");
		int [] arr = new int[str.length];

		for(int i=0;i<str.length;i++) 
			arr[i] = Integer.parseInt(str[i]+"");


		Arrays.parallelSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}
}
