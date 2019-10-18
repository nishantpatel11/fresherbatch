package com.train.utils;

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
