/*
9. Get min at pop
    Now, we'll try to solve a famous stack problem.
    You are given an array A of size N. You need to first push the elements of the array into a
    stack and then print minimum in the stack at each pop until stack becomes empty.
    
    Example 1:
    Input:
    
      N = 5
      A = {1 2 3 4 5}
    Output:
      1 1 1 1 1
    Explanation:
      After pushing elements to the stack,
      the stack will be "top -> 5, 4, 3, 2, 1".
      Now, start popping elements from the stack
      popping 5: min in the stack is 1.popped 5
      popping 4: min in the stack is 1. popped 4
      popping 3: min in the stack is 1. popped 3
      popping 2: min in the stack is 1. popped 2
      popping 1: min in the stack is 1. popped 1
    
    Example 2:
    Input:
      N = 7
      A = {1 6 43 1 2 0 5}
    Output:
      0 0 1 1 1 1 1
    Explanation:
      After pushing the elements to the stack,
      the stack will be 5->0->2->1->43->6->1.
      Now, poping the elements from the stack:
      popping 5: min in the stack is 0. popped 5
      popping 0: min in the stack is 0. popped 0
      popping 2: min in the stack is 1. popped 2
      popping 1: min in the stack is 1. popped 1
      popping 43: min in the stack is 1.
      popped 43
      popping 6: min in the stack is 1. popped 6
      popping 1: min in the stack is 1. popped 1.
    
    Expected Time Complexity: O(N).
    Expected Auxiliary Space: O(N).
    
    Constraints:
      0 <= Ai <= 107
*/

import java.util.*;

class Solution{
	public static Stack<Integer> _push(int arr[],int n){
        
        	Stack<Integer> s = new Stack<Integer>(); 
        	int x = Integer.MAX_VALUE;
        	for(int i = 0;i<arr.length;i++){
            		if(arr[i]<x){
                		x = arr[i];
            		}
            		s.push(x);
        	}		
        	return s;
    	}
    
    
    	static void _getMinAtPop(Stack<Integer>s){

		while(!s.empty()){
        	    	System.out.print(s.pop() + " ");
        	}
    	}
}

class Client{
	public static void main(String [] ars){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
				
		Solution obj = new Solution();
		Stack<Integer> s = obj._push(arr,arr.length);

		obj._getMinAtPop(s);
	}
}
