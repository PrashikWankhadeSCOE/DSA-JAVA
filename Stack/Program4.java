/*
4. Delete middle element of a stack
    Given a stack, delete the middle element of the stack without using any additional data
    structure.
    
    Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.
    
    Note: The output shown by the compiler is the stack from top to bottom.
    
    Example 1:
    Input:
      Stack = {10, 20, 30, 40, 50}
    Output:
      ModifiedStack = {10, 20, 40, 50}
    Explanation:
      If you print the stack the bottom-most element will be 10 and the top-most element will
      be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30,
      stack will look like {10 20 40 50}.
    
    Example 2:
    Input:
      Stack = {10 20 30 40}
    Output:
      ModifiedStack = {10 30 40}
    Explanation:
      If you print the stack the bottom-most element will be 10 and the top-most element will
      be 40. Middle element will be element at index 2 from bottom, which is 20. Deleting 20,
      stack will look like {10 30 40}.
    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(N)
    
    Constraints:
      2 ≤ size of stack ≤ 105 
*/

import java.util.Scanner;
import java.util.Stack;

class StackDelete{
    	//Function to delete middle element of a stack.
    	public void deleteMid(Stack s,int sizeOfStack){
        	// code here
        	Stack stack = new Stack();
        
        	boolean even = false;
        	if(s.size()%2 == 0){
       		     	even = true;
        	}
        
        	int x = 0;
        	while((sizeOfStack+1)/2 > x){
            		stack.push(s.pop());
            		x++;
        	}
        
        	if(even){
            		s.pop();
        	}
        	else
            		stack.pop();
        	while(!stack.empty()){
            		s.push(stack.pop());
        	}
    	}
}

class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		Stack s = new Stack();

		char repeat;
		do{
			int data = sc.nextInt();
			s.push(data);
			System.out.println("Want to continue");
			repeat = sc.next().charAt(0);
		}while(repeat == 'y' || repeat == 'Y');

		StackDelete obj = new StackDelete();
		obj.deleteMid(s,s.size());

		System.out.println(s);
	}
}
