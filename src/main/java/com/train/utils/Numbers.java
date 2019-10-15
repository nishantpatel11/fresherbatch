package com.train.utils;

import java.util.Random;

public class Numbers {
	
	Random randnum;

	public Numbers() {
		randnum = new Random();
		randnum.setSeed(123456789);
	}

	public int random(int i){
		return randnum.nextInt(i);
	}
}
