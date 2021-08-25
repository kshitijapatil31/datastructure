package com.bridgelabz.linkedlist;

public class QueueRunner {

	public static void main(String[] args) {
		MyQueue <Integer> myQueue=new MyQueue<>();
		MyNode<Integer> firstNode=new MyNode<>(56);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(70);
		myQueue.enQueue(firstNode);
		myQueue.enQueue(secondNode);
		myQueue.enQueue(thirdNode);
		myQueue.deQueue();
		myQueue.printQueue();
	}

}
