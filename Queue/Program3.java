/*
 * Q3. Reverse First K elements of Queue
 *   Given an integer K and a queue of integers, we need to reverse the order of the first
 *   K elements of the queue, leaving the other elements in the same relative order.
 *   Only following standard operations are allowed on queue.
 *   enqueue(x) : Add an item x to rear of queue
 *   dequeue() : Remove an item from front of queue
 *   size() : Returns number of elements in queue.
 *   front() : Finds front item.
 *   
 *   Note: The above operations represent the general processings. In-built functions of
 *   the respective languages can be used to solve the problem.
 *   
 *   Example 1:
 *   Input:
 *     5 3
 *     1 2 3 4 5
 *   Output:
 *     3 2 1 4 5
 *   
 *   Explanation:
 *     After reversing the given
 *     input from the 3rd position the resultant
 *     output will be 3 2 1 4 5.
 *   Example 2:
 *   Input:
 *     4 4
 *     4 3 2 1
 *   Output:
 *     1 2 3 4
 *   Explanation:
 *     After reversing the given
 *     input from the 4th position the resultant
 *     output will be 1 2 3 4.
 *   
 *   Expected Time Complexity : O(N)
 *   Expected Auxiliary Space : O(K)
 *   
 *   Constraints:
 *     1 <= N <= 1000
 *     1 <= K <= N
 */

import java.util.*;

class Solution{
	Queue<Integer> rever(Queue<Integer> q,int k){
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> que = new LinkedList<Integer>();

		while(k>0){
			stack.push(q.poll());
			k--;
		}
		while(!stack.isEmpty()){
			que.offer(stack.pop());
		}
		while(!q.isEmpty()){
			que.offer(q.poll());
		}
		return que;
	}
}
class Client{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many no do you want to be un Queue");
		int query = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println("Enter the numbers ");
		while(query>0){
			q.offer(sc.nextInt());
			query--;
		}
		System.out.println("Enter the no till which do u want to reverse");
		int x = sc.nextInt();

		Solution sol = new Solution();
		q = sol.rever(q,x);
		for(int i:q){
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}
