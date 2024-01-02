/*
13. Stack Operations
    This Java module deals with Stacks, Queues, and ArrayLists. We'll perform various
    operations on them.
    
    Given a stack of integers and Q queries. The task is to perform operation on stack
    according to the query.
    Note: use push() to add element in the stack, peek() to get topmost element without
    removal, pop() gives topmost element with removal, search() to return position if found
    else -1.
    Input Format:
    
      First line of input contains nubmer of testcases T. For each testcase, first line of input
      contains Q, number of queries. Next line contains Q queries seperated by space. Queries
      are as:
      i x : (adds element x in the stack).
      r : (returns and removes the topmost element from the stack).
      h : Prints the topmost element.
      f y : (check if the element y is present or not in the stack). Print "Yes" if present, else
      "No".
    Output Format:
      For each testcase, perform Q queries and print the output wherever required.
    Constraints:
      1 <= T <= 100
      1 <= Q <= 103
   
    Example:
    Input:
      2
      6
      i 2 i 4 i 3 i 5 h f 8
      4
      i 3 i 4 r f 3
    Output:
      5
      No
      Yes
    Explanation:
      Testcase 1: Inserting 2, 4, 3, and 5 onto the stack. Returning top element which is 5.
      Finding 8 will give No, as 8 is not in the stack.
*/

import java.util.*;

class Solution{
	public static void insert(Stack<Integer> st, int x){
        	st.push(x); 
    	}
    
        public static void remove(Stack<Integer> st){
        	int x = st.pop();
    	}
    	public static void headOf_Stack(Stack<Integer> st){
        	int x = st.peek();
        	System.out.println(x + " ");
	}
    
    
    	public static void find(Stack<Integer> st, int val){
        	if(st.search(val)!=-1){
            		System.out.println("Yes");
        	}
        	else{
            		System.out.println("No");
        	}
    	}		
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of queries you want to perform");
		int q = sc.nextInt();
		
		Stack<Integer> s = new Stack<Integer>();

		Solution obj = new Solution();
		// Even if we create the object of Solution in the for look stack 
		// will remain the same operations done will be done from diff 
		// object of Solution as each time new object will be created	
		for(int i = 0;i<q;i++){
			char ch = sc.next().charAt(0);
			switch(ch){
				case 'i':{
					int data = sc.nextInt();
					obj.insert(s,data);
					break;
				}
				case 'r':{
					obj.remove(s);
					break;
				}
				case 'h':{
					obj.headOf_Stack(s);
					break;
				}
				case 'f':{
					int data = sc.nextInt();
					obj.find(s,data);
					break;
				}
				default :{
					System.out.println("Input is Wrong");
					break;
				}
			}
		}
	}
}
