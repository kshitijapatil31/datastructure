package com.bridgelabz.linkedlist;

public class MyLinkedList {

	private INode head;
	private INode tail;
	
	
	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}


	public void add(INode newNode) {
		if(tail==null) {
			
			tail=newNode;
			
		} if(head==null) {
			
			head=newNode;
			
		}else {
			INode tempNode=head;
			head=newNode;
			head.setNext(tempNode);
		}
		
	}
	
	public void append(INode newNode) {
		if(head==null) {
			head=newNode;
		}if(tail==null) {
			tail=newNode;
		}else {
			tail.setNext(newNode);
			tail=newNode;
			
			
		}
		
		
	}
	
	public void insert(INode node,INode newNode) {
		INode temp=node.getNext();
		node.setNext(newNode);
		newNode.setNext(temp);
	}
	public INode pop() {
		INode temp=head;
		head=head.getNext();
		return temp;
	}
	public void print() {
		StringBuffer printformat=new StringBuffer("My Nodes: ");
	
		   INode tempNode=head;
		
		while(tempNode!=null) {
			printformat.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				printformat.append("-->");
			}
			tempNode=tempNode.getNext();
		}
		System.out.println(printformat);
	}
}