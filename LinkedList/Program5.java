/*
 *  5. Reverse a linked list
 *      Given a linked list of N nodes. The task is to reverse this list.
 *        Example 1:
 *          Input:
 *            LinkedList: 1->2->3->4->5->6
 *          Output: 6 5 4 3 2 1
 *          Explanation: After reversing the list, elements are 6->5->4->3->2->1.
 *        Example 2:
 *          Input:
 *            LinkedList: 2->7->8->9->10
 *          Output: 10 9 8 7 2
 *          Explanation: After reversing the list, elements are 10->9->8->7->2.
 *        Expected Time Complexity: O(N).
 *        Expected Auxiliary Space: O(1).
 *      Constraints:
 *        1 <= N <= 10^4 
 */

import java.util.*;

class ListNode{
	ListNode next = null;
	int data;
	ListNode(int data){
		this.data = data;
	}
}
class List{
	ListNode head = null;
	void add(int data){
		ListNode newNode = new ListNode(data);
		if(head == null){
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
	}
	ListNode rev(){
		ListNode curr = head;
		ListNode prev = null;
		ListNode forward = null;

		while(curr!=null){
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		return prev;
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of LinkedList");
		int x = sc.nextInt();
		
		List ll = new List();
		while(x>0){
			ll.add(sc.nextInt());
			x--;
		}
		ListNode head = ll.rev();

		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
