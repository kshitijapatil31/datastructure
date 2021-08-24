package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.INode;

public class MyStackNode<T> {

	 T key;
	 MyStackNode next;
	
	public MyStackNode(T key) {
		
		this.key = key;
		this.next = null;
	}
	
}
