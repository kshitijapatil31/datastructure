package com.bridgelabz.stack;

public class MyStack <T>{

	MyStackNode top;
	
	public void push(T key) {
		
		MyStackNode temp=new MyStackNode(key);
		
		if(isEmpty()) {
			top=temp;
			
			
		}else {
			temp.next=top;
			top=temp;
		}
		
		
	}
	public T pop(){
	     T value=null;
	     if(!isEmpty()){
	         top=top.next;
	         value=top.key;
	     }
	     return value;
	}
	     public T peek(){
	         return (T) top.value;
	        }
	  public String toString(){
		  MyStackNode current=top;
		        StringBuilder s=new StringBuilder();
		    
		     
		     while(current!=null){
		       s.append(current.key+"  ");
		       current=current.next;
		     }

		        return s.toString();
		    }
	public boolean isEmpty() {
		return(top==null)?true:false;
	}
	
	
}
