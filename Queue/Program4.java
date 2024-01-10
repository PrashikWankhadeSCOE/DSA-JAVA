/*
 *  Q4. Stack using two queues
 *   Implement a Stack using two queues q1 and q2.
 * 
 *   Example 1:
 *    Input:
 *      push(2)
 *      push(3)
 *   
 *      pop()
 *      push(4)
 *      pop()
 *    Output: 3 4
 *    Explanation:
 *      push(2) the stack will be {2}
 *      push(3) the stack will be {2 3}
 *      pop() poped element will be 3 the
 *      stack will be {2}
 *      push(4) the stack will be {2 4}
 *      pop() poped element will be 4
 *   
 *   Example 2:
 *    Input:
 *      push(2)
 *      pop()
 *      pop()
 *      push(3)
 *    Output: 2 -1
 *   
 *   Expected Time Complexity: O(1) for push() and O(N) for pop() (or vice-versa).
 *   Expected Auxiliary Space: O(1) for both push() and pop().
 *   
 *   Constraints:
 *     1 <= Number of queries <= 100
 *     1 <= values of the stack <= 100
 */

import java.util.*;

class Solution{
	Queue<Integer> q1 = new LinkedList();
	Queue<Integer> q2 = new LinkedList();

	void push(int a){
		q1.offer(a);
	}
	int pop(){
		int x = q1.size();
		int val = -1;
		while(x>1){
			if(!q1.isEmpty())
				q2.offer(q1.poll());
			x--;
		}
		
		if(!q1.isEmpty())
			val = q1.poll();

		while(!q2.isEmpty()){
			q1.offer(q2.poll());
		}
		return val;
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		Solution s = new Solution();
		
		System.out.println("Enter the number of queries you want to add");
		int q = sc.nextInt();
		
		while(q>0){
			int a = sc.nextInt();
			switch(a){
				case 1:{
					System.out.println("Enter data you want to add in Stack");
					s.push(sc.nextInt());
					break;
				}
				case 2:{
					int z = s.pop();
					if(z!=-1){
						System.out.println(z);
					}
					break;
				}
				default :{
					break;
				}
			}
			q--;
		}
	}
}
