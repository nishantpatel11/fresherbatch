package com.queue.model;

public class Queue {

	static class Node { 
		int data; 
		int priority; 
		Node next; 

	} 

	static Node node = new Node(); 
	static Node newNode(int d, int p) {
		
		Node temp = new Node(); 
		temp.data = d; 
		temp.priority = p; 
		temp.next = null; 

		return temp; 
	} 

	static int peek(Node head) {
		
		return (head).data; 
	} 

	static Node pop(Node head) {
		
		head = head.next; 
		return head; 
	} 

	static Node push(Node head, int d, int p) {
		
		Node start = (head); 
		Node temp = newNode(d, p); 

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
		return ((head) == null)?1:0; 
	} 

	public static void main(String args[]) 
	{ 
		// Create a Priority Queue 
		// 7.4.5.6 
		Node pq = newNode(4, 1); 
		pq =push(pq, 5, 2); 
		pq =push(pq, 6, 5); 
		pq =push(pq, 7, 5); 

		while (isEmpty(pq)==0) { 
			System.out.printf("%d ", peek(pq)); 
			pq=pop(pq); 
		} 

	} 
} 

