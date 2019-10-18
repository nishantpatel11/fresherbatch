package com.train;

import java.util.Scanner;

import com.train.utils.Student;
import com.train.utils.Subject;

public class Marksheet {

	static Scanner scr = new Scanner(System.in);

	static Student stud1;
	static Student stud2;
	static Student stud3;
	static int noOfsub = 0;

	public static void main(String[] args) {

		while(true) {

			System.out.println("Please pick given option \n"
					+ "1. Add Student Details \n"
					+ "2. Average of Each Student \n"
					+ "3. Details of Student \n"
					+ "4. Exit or Quit"
					+ "\n");

			System.out.println("Enter your choice");

			int ch = scr.nextInt();

			switch(ch) {
			case 1: System.out.println("Please provide Details ");
			addSudent();
			break;
			case 2:averageEachStudent();
			break;
			case 3:displayStudent();
			break;
			case 4:System.exit(0);
			default :break;
			}
		}
	}

	private static void averageEachStudent() {

		int totalMark = stud1 !=null ? (stud1.getEnglish() != null ? stud1.getEnglish().getMark(): 0 ):0 ;
		totalMark += stud1 !=null ? (stud1.getMath() != null ? stud1.getMath().getMark(): 0 ):0 ;
		totalMark += stud1 !=null ? (stud1.getScience() != null ? stud1.getScience().getMark(): 0 ):0 ;	
	
		Double avgMark = (totalMark/(double)noOfsub)*100;
		System.out.println("Stduent Details \n"
				+ "Total marks is : "+totalMark
				+"\n Average marks is :"+avgMark );
		
	}

	private static void displayStudent() {
		System.out.println(" Student Details ");
		System.out.println(" ============ ");
		System.out.println(" \n "+stud1);
		System.out.println(" ============ ");	
		System.out.println(" \n "+stud1);
		System.out.println(" ============ ");
		System.out.println(" \n "+stud1);
	}

	private static void addSudent() {

		System.out.println("Enter a Student Name");
		String name = scr.next();
		Subject sub1 = addSubject(); 
		Subject sub2 = addSubject(); 
		Subject sub3 = addSubject(); 

		stud1 = new Student(name,sub1,sub2,sub3);
	}

	private static Subject addSubject() {

		System.out.println("Enter Subject");
		String subj = scr.next();
		System.out.println("Enter Marks");
		Integer mark =scr.nextInt();

		++noOfsub;
		return new Subject(subj, mark);
	}
}
