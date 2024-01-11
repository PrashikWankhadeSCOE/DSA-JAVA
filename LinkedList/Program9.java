/*
 *  9. Remove duplicate element from sorted Linked List
 *      Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with
 *      duplicate values) from the given list (if exists).
 *      
 *      Note: Try not to use extra space. The nodes are arranged in a sorted way.
 *      Example 1:
 *      Input:
 *      LinkedList: 2->2->4->5
 *      Output: 2 4 5
 *      Explanation: In the given linked list 2 ->2 -> 4-> 5, only 2 occurs more than 1 time. So we need
 *      to remove it once.
 *      Example 2:
 *      Input:
 *      LinkedList: 2->2->2->2->2
 *      Output: 2
 *      Explanation: In the given linked list 2 ->2 ->2 ->2 ->2, 2 is the only element and is repeated 5
 *      times. So we need to remove any four 2.
 *      Expected Time Complexity : O(N)
 *      Expected Auxiliary Space : O(1)
 *      Constraints:
 *      1 <= Number of nodes <= 10^5
 */

import java.util.*;

class ListNode{
	int data;
	ListNode next;
	ListNode(int data){
		this.data = data;
	}
}
class RemoveDup{
	ListNode head = null;
	void add(int x){
		ListNode newNode = new ListNode(x);
		if(head == null){
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
	}
	ListNode removeDup(){
		ListNode temp = head;
		while(temp != null){
			
			if(temp.next!=null && temp.data == temp.next.data){
				if(temp.next!=null){
					temp.next = temp.next.next;
				}
			}else{
				temp = temp.next;
			}
		}
		return head;	
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int query = sc.nextInt();

		RemoveDup ll = new RemoveDup();
		while(query>0){
			ll.add(sc.nextInt());
			query--;
		}

		ListNode head = ll.removeDup();
		
		while(head!=null){
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
}
