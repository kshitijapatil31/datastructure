package com.bridgelabz.linkedlist;

public class MyQueue<T> {
private  MyLinkedList myLinkedList; 

	public MyQueue() {
		myLinkedList=new MyLinkedList();
	}
	
	public void enQueue(INode<T> node) {
		myLinkedList.append(node);
	}
	public void printQueue() {
		myLinkedList.print();
	}

}
