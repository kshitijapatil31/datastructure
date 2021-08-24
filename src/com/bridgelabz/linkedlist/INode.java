package com.bridgelabz.linkedlist;

public interface INode<T> {

	
  
	int key = 0;
	T getKey();
	void setKey(T key);
	
	INode getNext();
	void setNext(INode next);
}
