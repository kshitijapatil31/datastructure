package com.bridgelabz.stack;

public class MyLinkedList {

	private INode head;
	private INode tail;
	private int size;
	
	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
		size=0;
	}

	public int listSize() {
		return size;
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
		size++;
		
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
		
		size++;
	}
	
	public void insert(INode node,INode newNode) {
		INode temp=node.getNext();
		node.setNext(newNode);
		newNode.setNext(temp);
		size++;
	}
	public INode pop() {
		INode temp=head;
		head=head.getNext();
		size--;
		return temp;
		
	}
	public INode popLast() {
		INode temp=head;
		while(!temp.getNext().equals(tail)) {
			temp=temp.getNext();
		}
		tail=temp;
		temp=temp.getNext();
		size--;
		return temp;
	}
	public void search(int value) {
		INode temp=head;
		for(int i=0;i<size-1;i++) {
			temp=temp.getNext();
			if(temp.getKey().equals(value)) {
				System.out.println(i);
			}
		}
	}
	public void searchAndInsert(int value,INode newNode) {
		INode temp=head;
		for(int i=0;i<size-1;i++) {
			temp=temp.getNext();
			if(temp.getKey().equals(value)) {
				temp.setNext(newNode);
				newNode.setNext(temp);
				//System.out.println(i);
			}
		}
	}
	public void print() {
		StringBuffer printformat=new StringBuffer("My Nodes: ");
	
		   INode tempNode=head;
		
		while(tempNode.getNext()!=null) {
			printformat.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				printformat.append("-->");
			}
			tempNode=tempNode.getNext();
		}
		printformat.append(tempNode.getKey());
		System.out.println(printformat);
	}
}