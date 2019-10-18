package com.train.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.train.collection.model.Date;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Date,String> hashMap = new HashMap<Date,String>();
		Date date = new Date(10, 10, 2010);
		Date date1 = new Date(10, 10, 2011);
		Date date2 = new Date(10, 11, 2002);
		Date date3 = new Date(10, 10, 2003);
		
		hashMap.put(date, "Vishant");
		hashMap.put(date1, "Vinit");
		hashMap.put(date2, "Prashant");
		hashMap.put(date3, "Vikas");
		
		 Set<Map.Entry<Date,String>>entryset = hashMap.entrySet();
		 
		 for(Map.Entry<Date,String> entry: entryset) {
			 System.out.println(entry.getKey()+" : "+entry.getValue());
		 }
		
	}

}
