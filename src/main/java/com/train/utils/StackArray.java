package com.train.utils;

import java.util.Stack;

public class StackArray {

	
	private int arr[];
	private int index;
	public void push(int data) {
		
		arr[index++] = data;
	}
	
	public int pop() {

		if(arr.length<1)
			return -1;
		
		return arr[index--];
	
	}
}
