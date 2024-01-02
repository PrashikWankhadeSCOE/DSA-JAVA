/*
11. Reversing the equation
    Given a mathematical equation that contains only numbers and +, -, *, /. Print the
    equation in reverse, such that the equation is reversed, but the numbers remain the same.
    It is guaranteed that the given equation is valid, and there are no leading zeros.
    
    Example 1:
    Input:
      S = "20-3+5*2"
    Output: 2*5+3-20
    Explanation: The equation is reversed with
      numbers remaining the same.
    
    Example 2:
    Input:
      S = "5+2*56-2/4"
    Output: 4/2-56*2+5
    Explanation: The equation is reversed with
      numbers remaining the same.
    Expected Time Complexity: O(|S|).
    Expected Auxiliary Space: O(|S|).
    
    Constraints:
      1<=|S|<=105
      The string contains only the characters '0' - '9', '+', '-', '*', and '/'.
*/

// TLE Occured but dont know whyy ?? !!
//

import java.util.*;

class Solution{
	String reverseEqn(String S){
        
        	Stack<String> s = new Stack<String>();
        	String str = "";
        	for(int i = 0;i<S.length();i++){
            		if(S.charAt(i)=='*' ||S.charAt(i)=='/' ||S.charAt(i)=='-' ||S.charAt(i)=='+'){
                		s.push(str);
                		s.push(String.valueOf(S.charAt(i)));
                		str = "";
            		}else{
                		str += S.charAt(i); 
            		}
        	}
        	if(str!=""){
            		s.push(str);
        	}
        	str = "";
        
		while(!s.empty()){
        	    	str += s.pop();
        	}
        	return str;
   	}
}

class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		Solution obj = new Solution();
		System.out.println(obj.reverseEqn(str));
	}
}
