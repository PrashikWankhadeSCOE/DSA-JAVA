/*

2. Implement stack using array
    Write a program to implement a Stack using Array. Your task is to use the class as shown
    in the comments in the code editor and complete the functions push() and pop() to
    implement a stack.

    Example 1:

    Input:
      push(2)
      push(3)
      pop()
      push(4)
      pop()
    
    Output: 3, 4
    
    Explanation:
      push(2) the stack will be {2}
      push(3) the stack will be {2 3}
      pop() poped element will be 3,
      the stack will be {2}
      push(4) the stack will be {2 4}
      pop() poped element will be 4
    
    Example 2:
    
    Input:
      pop()
    
      push(4)
      push(5)
      pop()
    Output: -1, 5
    
    Expected Time Complexity : O(1) for both push() and pop().
    
    Expected Auixilliary Space : O(1) for both push() and pop().
    Constraints:
      1 <= Q <= 100
      1 <= x <= 100
*/

import java.util.Scanner;

class Stack{
	int top;
	int [] arr;
	
	Stack(int size){
		arr = new int[size];
		top = -1;
	}
	void push(int data){
		top++;
		arr[top] = data;
	}	
	int pop(){
		if(top == -1){
			return -1;
		}
		int val = arr[top];
		top--;
		return val;
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		Stack stack = new Stack(size);
		
		char repeat;
		do{
			System.out.println("Chose from below");
			System.out.println("1.push");
			System.out.println("2.pop");

			int choice = sc.nextInt();
			
			if(choice == 1){
			
				System.out.println("Enter data you want to add to stack");
				int data = sc.nextInt();
				stack.push(data);
			}
			else{
				stack.pop();
			}
			System.out.println("If you want to repeat type y or Y");
			repeat = sc.next().charAt(0);

		}while(repeat == 'y' || repeat == 'Y');
	}
}
