package com.bridgelabz.linkedlist;

public class LinkedListRunner {

	public static void main(String[] args) {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinkedList=new MyLinkedList();
		
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		myLinkedList.print();
		
		
//		firstNode.setNext(secondNode);
//		secondNode.setNext(thirdNode);
//        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
//        System.out.println(result);
		
	}

}
