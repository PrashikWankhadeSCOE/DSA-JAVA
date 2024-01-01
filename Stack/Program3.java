/*
3. Implement two stacks in an array

    Your task is to implement 2 stacks in one array efficiently. You need to implement 4
    methods.
    push1 : pushes element into first stack.
    push2 : pushes element into second stack.
    pop1 : pops element from first stack and returns the popped element. If first stack is
    empty, it should return -1.
    pop2 : pops element from second stack and returns the popped element. If second stack is
    empty, it should return -1.
    
    Example 1:
    
    Input:
      push1(2)
      push1(3)
      push2(4)
      pop1()
      pop2()
      pop2()
    
    Output:
      3 4 -1
    
    Explanation:
      push1(2) the stack1 will be {2}
      push1(3) the stack1 will be {2,3}
      push2(4) the stack2 will be {4}
      pop1() the poped element will be 3 from stack1 and stack1 will be {2}
      pop2() the poped element will be 4 from stack2 and now stack2 is empty
      pop2() the stack2 is now empty hence returned -1.
    
    Example 2:
    
    Input:
      push1(1)
      push2(2)
      pop1()
      push1(3)
      pop1()
      pop1()
      
    Output:
      1 3 -1
    
    Explanation:
      push1(1) the stack1 will be {1}
      push2(2) the stack2 will be {2}
      pop1() the poped element will be 1 from stack1 and stack1 will be empty
      push1(3) the stack1 will be {3}
      pop1() the poped element will be 3 from stack1 and stack1 will be empty
      pop1() the stack1 is now empty hence returned -1.
    
    Expected Time Complexity: O(1) for all the four methods.
    Expected Auxiliary Space: O(1) for all the four methods.
    
    Constraints:
      1 <= Number of queries <= 104
      1 <= Number of elements in the stack <= 100
      The sum of count of elements in both the stacks < size of the given array
*/

import java.util.*;

class TwoStack{
	int top = -1;
	int end;
	int []arr;
	TwoStack(int size){
    		arr = new int[size];
		end = size;
	}
    	//Function to push an integer into the stack1.
    	void push1(int x){
        	if(end-top>1){
	            	top++;
        	    	arr[top] = x;
        	}
    	}
    	//Function to push an integer into the stack2.
    	void push2(int x){
        	if(end - top > 1){
            		end--;
        	    	arr[end] = x;
        	}
    	}
    	//Function to remove an element from top of the stack1.
    	int pop1(){
        	if(top == -1){
            		return -1;
        	}
        	int val = arr[top];
        	top--;
        	return val;
    	}
    	//Function to remove an element from top of the stack2.
    	int pop2(){
        	if(end==arr.length){
            		return -1;
        	}
        	int val = arr[end];
        	end++;
        	return val;
    	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of stack");
		int size = sc.nextInt();
		
		TwoStack stack = new TwoStack(size);

		char repeat;
		do{
			System.out.println("Enter what do you want to perform !");
			System.out.println("1.push in stack 1");
			System.out.println("2.push in stack 2");
			System.out.println("3.pop from stack 1");
			System.out.println("4.pop form stack 2");

			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					System.out.println("Enter the data you want to push ");
					int data = sc.nextInt();
					stack.push1(data);
					break;
				}
				case 2 :{
					System.out.println("Enter the data you want to push in stack 2");
					int data = sc.nextInt();
					stack.push2(data);
					break;
				}
				case 3 : {
					System.out.println(stack.pop1());
					break;
				}
				case 4 : {
					System.out.println(stack.pop2());
					break;
				}
				default :{
					System.out.println("Please enter aa valid option ");
					break;
				}
			}
			System.out.println("To continue enter 'Y' or 'y' " );
			repeat = sc.next().charAt(0);
		}while(repeat == 'y' || repeat == 'Y');
	}
}
