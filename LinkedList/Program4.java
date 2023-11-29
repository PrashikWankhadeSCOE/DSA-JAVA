/*
 * 4.Doubly linked list Insertion at given position
 * 
 * Given a doubly-linked list, a position p, and an integer x. The task is to add a new node with
 * value x at the position just after pth node in the doubly linked list.
 * 
 * Example 1:
 * Input:
 * LinkedList: 2<->4<->5
 * p = 2, x = 6
 * Output: 2 4 5 6
 * Explanation: p = 2, and x = 6. So, 6 is inserted after p, i.e, at position 3 (0-based indexing).
 * Example 2:
 * Input:
 * LinkedList: 1<->2<->3<->4
 * p = 0, x = 44
 * Output: 1 44 2 3 4
 * Explanation: p = 0, and x = 44 . So, 44 is inserted after p, i.e, at position 1 (0-based indexing).
 * Expected Time Complexity : O(N)
 * Expected Auxiliary Space : O(1)
 * 
 * Constraints:
 * 1 <= N <= 10^4
 * 0 <= p < N
 */

class Node{
	int data;
	Node next = null;
	Node prev = null;
	Node(int data){
		this.data = data;
	}
}
class LinkedList{
	Node head = null;
	int countNode(){
		int c = 0;
		Node temp = head;
		while(temp!=null){
			c++;
			temp=temp.next;
		}
		return c;
	}
	void addAtPos(int p,int data){

		Node newNode = new Node(data);
		Node temp = head;
		//constraint 0<= p < N  this is method follows this constraints
		if(p==countNode()-1){
			while(temp.next!=null){
				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}
		else{
			while(p > 0){
				temp = temp.next;
				p--;
			}
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		}

	}
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	void printlist(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
class Client{
	public static void main(String [] arg){
		LinkedList list = new LinkedList();
		list.addFirst(30);
		list.addFirst(10);
		list.printlist();
		list.addAtPos(0,20);
		list.printlist();

	}
}

