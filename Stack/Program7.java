/*
7. Special Stack
    Design a data-structure SpecialStack that supports all the stack operations like push(),
    pop(), isEmpty(), isFull() and an additional operation getMin() which should return
    minimum element from the SpecialStack. Your task is to complete all the functions, using
    stack data-Structure.
    
    Example 1:
    Input:
      Stack: 18 19 29 15 16
    Output: 15
    Explanation:
      The minimum element of the stack is 15.
      Note: The output of the code will be the value returned by getMin() function.
      Expected Time Complexity: O(N) for getMin, O(1) for remaining all 4 functions.
      Expected Auxiliary Space: O(1) for all the 5 functions.
    Constraints:
      1 ≤ N ≤ 104
*/

import java.util.*;

class Solution{
	public void push(int a,Stack<Integer> s){
	    	s.push(a);
	}
	public int pop(Stack<Integer> s){
            	return s.pop();
	}
	public int min(Stack<Integer> s){
           	int x = Integer.MAX_VALUE;
           	while(!s.empty()){
                	int num = s.pop();
                	if(num<x){
                    		x = num;
                	}
           	}
           	return x; 
	}
	public boolean isFull(Stack<Integer>s, int n){
           	return s.size()==n;
	}
	public boolean isEmpty(Stack<Integer>s){
           	return s.empty();
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		Stack<Integer> st = new Stack<Integer>();

		int q = sc.nextInt();

		Solution obj = new Solution();
		while(!obj.isEmpty(st)){
			obj.pop(st);
		}	
		while(!obj.isFull(st,q)){
			obj.push(sc.nextInt(),st);
		}
		System.out.println(obj.min(st));
	}
}
