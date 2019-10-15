package com.train.utils;

public class Searching {

	public int search(int arr[], int n, int x) 
    { 
        if (arr[n - 1] == x) 
            return n-1; 
  
        int backup = arr[n - 1]; 
        arr[n - 1] = x; 
  
        for (int i = 0;; i++) { 
            if (arr[i] == x) { 
                arr[n - 1] = backup; 
  
                if (i < n - 1) 
                    return i; 
  
                return -1; 
            } 
        } 
    } 
}
