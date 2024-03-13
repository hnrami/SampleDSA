package com.sample.java8;

public class Singlell {
	
	// creating head node
	private LinkNode head;
	
	
	//11 --> 7  --> 5 ---> 1 --> null
	
	private static  class LinkNode{
		
		int data;
		LinkNode next;
		
		public LinkNode(int data) {
			this.data=data;
			this.next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singlell ll = new Singlell();
//		ll.insertfirst(44);
//		ll.insertfirst(22);
//		ll.insertfirst(33);
//		
		
		ll.insertlast(4);
		ll.insertlast(2);
		ll.insertlast(3);
//		ll.head = new LinkNode(11);
//		LinkNode secondnode = new LinkNode(7);
//		LinkNode thirdnode = new LinkNode(5);
//		LinkNode fourthnode = new LinkNode(1);
//		
//		ll.head.next=secondnode;
//		secondnode.next=thirdnode;
//		thirdnode.next=fourthnode;
//		fourthnode.next=null;
		System.out.println(ll.displayNode());
		
	}

	public int displayNode() {
		
		if(head==null)
			return 0; 
		
		LinkNode cuLinkNode = head;
		int count=0;
		while (cuLinkNode!=null) {
			
			System.out.print(cuLinkNode.data+"--->");
			cuLinkNode=cuLinkNode.next;
			count++;
		}
		System.out.print("null");
		return count;
		
	}
	public void insertfirst(int value) {
		LinkNode newnode = new LinkNode(value);
		newnode.next=head;
		head = newnode;
		
	}
	
	public void insertlast(int value) {
		LinkNode newnode = new LinkNode(value);
		
		if(head ==null) {
			head=newnode;
			return;
		}
		
		LinkNode cueentnode=head;
		while(cueentnode.next!=null) {
			
			cueentnode=cueentnode.next;
			
		}
		cueentnode.next=newnode;
		
	}
}
