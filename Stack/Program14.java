/*
14. Insert an Element at the Bottom of a Stack
    You are given a stack St of N integers and an element X. You have to insert X at the
    bottom of the given stack.
    
    Example 1:
    Input:
      N = 5
      X = 2
      St = {4,3,2,1,8}
    Output:
      {2,4,3,2,1,8}
    Explanation:
      After insertion of 2, the final stack will be {2,4,3,2,1,8}.
    
    Example 2:
    Input:
      N = 3
      X = 4
      St = {5,3,1}
    Output:
      {4,5,3,1}
    Explanation:
      After insertion of 4, the final stack will be {4,5,3,1}.
    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(N)
    
    Constraints:
      1 <= N <= 105
      1 <= X, Elements of Stack <= 103
      Sum of N over all test cases doesn't exceeds 106
*/

import java.util.*;

class Solution{
	public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {
	        Stack<Integer> s = new Stack<>();
        	while(!St.empty()){
            		s.push(St.pop());
        	}
        	s.push(X);
        	while(!s.empty()){
            		St.push(s.pop());
        	}
        	return St;
    	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Stack<Integer> St = new Stack<Integer>();
		System.out.println("Enter no of stacks you want to push");
		int q = sc.nextInt();
		for(int i = 0;i<q;i++){
			St.push(sc.nextInt());
		}
		System.out.println("Enter the element you want to add at the bottom of stack");
		int X = sc.nextInt();

		Solution obj = new Solution();
		System.out.println(obj.insertAtBottom(St,X));
	}
}
