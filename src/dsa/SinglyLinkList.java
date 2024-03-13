package dsa;

public class SinglyLinkList {

	private ListNode head;

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {

		SinglyLinkList ll = new SinglyLinkList();
		ll.head = new ListNode(10);
		ListNode secondNode = new ListNode(9);
		ListNode thirdNode = new ListNode(5);
		ListNode fourthNode = new ListNode(4);
		ListNode fitthNode = new ListNode(1);

		ll.head.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		fourthNode.next = fitthNode;
		fitthNode.next = null;
		ll.printlinklist();
	}
	
	public  void printlinklist() {
		
		ListNode current = head;
		while(current!=null) {
			
			System.out.print(current.data+"--->");
			current = current.next;
		}
		
		System.out.print("null>");
	}

}
