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
	public INode popLast() {
		INode temp=head;
		while(!temp.getNext().equals(tail)) {
			temp=temp.getNext();
		}
		tail=temp;
		temp=temp.getNext();
		return temp;
	}
	public void search(int key) {
		INode temp=head;
		int i=1;
		boolean flag=false;
		if(head==null) {
			System.out.println("list is empty");
		}else {
			while(temp!=null&& temp.getNext()!= null) {
				if(temp.key==key) {
					flag=true;
					break;
				}
				i++;
				temp=temp.getNext();
			}
		}
		if(flag) {
			System.out.println(i);
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