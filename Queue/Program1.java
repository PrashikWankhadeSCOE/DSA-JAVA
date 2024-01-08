
/*
 * Q1. Queue using two Stacks
 *    Implement a Queue using 2 stacks s1 and s2 .
 *    A Query Q is of 2 Types
 *    (i) 1 x (a query of this type means pushing 'x' into the queue)
 *    (ii) 2 (a query of this type means to pop element from queue and print the poped
 *    element)
 *    Note :- If there is no element return -1 as answer while popping.
 *
 *    Example 1:
 *    Input:
 *      5
 *      1 2 1 3 2 1 4 2
 *    Output:
 *      2 3
 *    Explanation:
 *      In the first test case
 *      1 2 the queue will be {2}
 *      1 3 the queue will be {2 3}
 *      2 popped element will be 2 the queue
 *      will be {3}
 *      1 4 the queue will be {3 4}
 *      2 popped element will be 3.
 *    Example 2:
 *    Input:
 *      4
 *      1 2 2 2 1 4
 *
 *    Output:
 *      2 -1
 *
 *    Explanation:
 *      In the second test case
 *      1 2 the queue will be {2}
 *      2 popped element will be 2 and
 *      then the queue will be empty
 *      2 the queue is empty and hence -1
 *      1 4 the queue will be {4}.
 *      Expected Time Complexity : O(1) for push() and O(N) for pop() or O(N) for
 *      push() and O(1) for pop()
 *      Expected Auxiliary Space : O(1).
 *    Constraints:
 *      1 <= Q <= 100
 *      1 <= x <= 100
 */

import java.util.*;

class StackQueue{
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	void Push(int x){
		s1.push(x);
	}
	int Pop(){
		if(s1.empty()){
			return -1;
		}
		while(!s1.empty()){
			s2.push(s1.pop());
		}
		int x = s2.pop();
		while(!s2.empty()){
			s1.push(s2.pop());
		}
		return x;
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		StackQueue q = new StackQueue();
		int query = sc.nextInt();

		while(query>0){
			System.out.println("1. add");
			System.out.println("2.pop");

			int n = sc.nextInt();

			if(n == 1){
				int x = sc.nextInt();
				q.Push(x);
			}
			else if(n == 2){
				System.out.print(q.Pop()+" ");
			}
			query--;
		}
	}
}
