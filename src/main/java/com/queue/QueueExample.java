package com.queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QueueExample {


	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {


		while(true) {
			System.out.println("Choose any given below option \n"
					+ "----------------------------------------\n"
					+ "(1) New Patient \n"
					+ "(2) Next Patient\n"
					+ "(3) Waiting Patient \n"
					+ "(4) Exit\n"
					+ "----------------------------------------\n\n"
					+ "Please choose any option in mention above \n"
					+ "");
			int ch = scr.nextInt();
			switch(ch) {
			case 1:
			default : System.out.println("Invalid Choice, Please choose right option");
				break;
			}
		}
	}

}
