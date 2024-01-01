
/*

1. Immediate Smaller Element
    Given an integer array Arr of size N. For each element in the array, check whether the
    right adjacent element (on the next immediate position) of the array is smaller. If next
    element is smaller, update the current index to that element. If not, then -1.
   
    Example 1:
   
    Input:
      N = 5
      Arr[] = {4, 2, 1, 5, 3}
    Output:
      2 1 -1 3 -1
    Explanation: 
        Array elements are 4, 2, 1, 5
        3. Next to 4 is 2 which is smaller, so we
        print 2. Next of 2 is 1 which is smaller,
        so we print 1. Next of 1 is 5 which is
        greater, so we print -1. Next of 5 is 3
        which is smaller, so we print 3. Note
        that for last element, output is always
        going to be -1 because there is no element
        on right.
        
    Example 2:
    
    Input:
      N = 6
      Arr[] = {5, 6, 2, 3, 1, 7}
    Output:
      -1 2 -1 1 -1 -1
    Explanation: 
        Next to 5 is 6 which is
        greater, so we print -1.Next of 6 is 2
        which is smaller, so we print 2. Next
        of 2 is 3 which is greater, so we
        print -1. Next of 3 is 1 which is
        smaller, so we print 1. Next of 1 is
        7 which is greater, so we print -1.
        Note that for last element, output is
        always going to be -1 because there is
        no element on right.
        
    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(1)
    
    Constraints:
      1 ≤ N ≤ 107
      1 ≤ Arr[i] ≤ 105
*/

import java.util.Stack;
import java.util.Scanner;
class Solution{
	void imdSmaller(int a[]){
		// Write your code here.
        	Stack<Integer> stack = new Stack<Integer>();
        	for(int i = 0;i<a.length-1;i++){
            		if(a[i]<a[i+1]){
		                stack.push(-1);
            		}
            		else{
                		stack.push(a[i+1]);
            		}
        	}
	        stack.push(-1);
        	for(int i = a.length-1;i>=0;i--){
            		a[i]=stack.pop();
        	}
    	}
}

class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr [] = new int[size];

		for(int i = 0;i<size;i++){
			arr[i] = sc.nextInt();
		}

		Solution obj = new Solution();
		obj.imdSmaller(arr);

		System.out.print("[ ");
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.print(" ]");
	}
}
