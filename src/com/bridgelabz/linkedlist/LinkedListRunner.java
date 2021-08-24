package com.bridgelabz.linkedlist;

public class LinkedListRunner {

	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> newNode = new MyNode<Integer>(40);
		MyLinkedList myLinkedList=new MyLinkedList();
		
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		//myLinkedList.append(thirdNode);
		myLinkedList.insert(firstNode,secondNode);
		
		//myLinkedList.pop();
		//myLinkedList.search(30);
		myLinkedList.searchAndInsert(30,newNode);
		myLinkedList.print();
		
		

		
	}

}
