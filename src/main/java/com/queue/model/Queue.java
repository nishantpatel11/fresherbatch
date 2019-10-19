package com.queue.model;

public class Queue {

	static class Node { 
		Patient patient; 
		int priority; 
		Node next; 

	} 

	static Node node = new Node(); 
	static Node newNode(Patient patient, int p) {
		
		Node temp = new Node(); 
		temp.patient = patient; 
		temp.priority = p; 
		temp.next = null; 

		return temp; 
	} 

	static Patient peek(Node head) {
		
		return head.patient; 
	} 

	static Node pop(Node head) {
		
		head = head.next; 
		return head; 
	} 

	static Node push(Node head, Patient patient, int p) {
		
		Node start = (head); 
		Node temp = newNode(patient, p); 

		if ((head).priority < p) { 

			temp.next = head; 
			(head) = temp; 
		} 
		else { 

			while (start.next != null && 
					start.next.priority > p) { 
				start = start.next; 
			} 

			temp.next = start.next; 
			start.next = temp; 
		} 
		return head; 
	} 

	static int isEmpty(Node head) 
	{ 
		return (head == null)?1:0; 
	} 

	public static void main(String args[]) 
	{ 
		Node pq = newNode(new Patient(1, "nish", 23, "Male"), 1); 
		pq =push(pq, new Patient(1, "nish", 24, "Male"), 2); 
		pq =push(pq, new Patient(1, "nish", 25, "Male"), 5); 
		pq =push(pq, new Patient(1, "nish", 26, "Male"), 5); 

		System.out.println(isEmpty(pq));
		while (isEmpty(pq)==0) { 
			System.out.println( peek(pq)); 
			pq=pop(pq); 
		} 

	} 
} 

