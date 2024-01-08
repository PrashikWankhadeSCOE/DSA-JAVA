/*
 * Q2. Queue Reversal
 *  Given a Queue Q containing N elements. The task is to reverse the Queue. Your
 *  task is to complete the function rev(), that reverses the N elements of the queue.
 *  
 *  Example 1:
 *  Input:
 *    6
 *    4 3 1 10 2 6
 *  Output:
 *    6 2 10 1 3 4
 *  Explanation:
 *    After reversing the given elements of the queue , the resultant queue will be 6 2 10
 *    1 3 4.
 *  
 *  Example 2:
 *  
 *  Input:
 *    4
 *    4 3 2 1
 *  Output:
 *    1 2 3 4
 *  Explanation:
 *    After reversing the given elements of the queue , the resultant queue will be 1 2 3
 *    4.
 *   Expected Time Complexity : O(n)
 *   Expected Auxiliary Space : O(n)
 *  Constraints:
 *    1 ≤ N ≤ 105
 *    1 ≤ elements of Queue ≤ 105
 */


import java.util.*;

class Solution{
	Queue<Integer> reverse(Queue<Integer> q){
		Stack<Integer> stack = new Stack<Integer>();
		while(!q.isEmpty()){
			stack.push(q.poll());
		}
		while(!stack.empty()){
			q.offer(stack.pop());
		}
		return q;
	}
}	
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new PriorityQueue<Integer>();
		int q = sc.nextInt();
		while(q>0){
			queue.offer(sc.nextInt());
			q--;
		}
		Solution obj = new Solution();
		queue = obj.reverse(queue);

		while(!queue.isEmpty()){
			System.out.print(queue.poll()+ " ");
		}
	}
}
