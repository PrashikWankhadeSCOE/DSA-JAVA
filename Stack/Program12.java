
/*
12. Stack designer

    You are given an array arr of size N. You need to push the elements of the array into a
    stack and then print them while popping.
    
    Example 1:
    Input:
      n = 5
      arr = {1 2 3 4 5}
    Output:
      5 4 3 2 1
    
    Example 2:
    Input:
      n = 7
      arr = {1 6 43 1 2 0 5}
    Output:
      5 0 2 1 43 6 1
    
    Constraints:
    1 <= Ai <= 107
*/

import java.util.*;

class Solution{
	public static Stack<Integer>_push(ArrayList<Integer> arr){
    
    		Stack<Integer> s = new Stack<Integer>();
    
    		Iterator itr = arr.iterator();
    		while(itr.hasNext()){
        		s.push((int)itr.next());
    		}
    		return s;
	}
	public static void _pop(Stack<Integer>s){
    		while(!s.empty()){
        		System.out.print(s.pop()+" ");
    		}		
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Add element to ArrayList");
		char a;
		do{
			arr.add(sc.nextInt());
			a = sc.next().charAt(0);
		}while(a == 'y');
		
		Solution obj = new Solution();
		Stack<Integer> s = obj._push(arr);
		obj._pop(s);
	}
}
