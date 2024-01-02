/*
8. Evaluation of Postfix Expression
    Given string S representing a postfix expression, the task is to evaluate the expression
    and find the final value. Operators will only include the basic arithmetic operators like *,
    /, + and -.

    Example 1:
    Input: S = "231*+9-"
    Output: -4
    Explanation:
      After solving the given expression,
      we have -4 as a result.
    
    Example 2:
    Input: S = "123+*8-"
    Output: -3
    Explanation:
      After solving the given postfix
      expression, we have -3 as a result.
    
    Expected Time Complexity: O(|S|)
    Expected Auxiliary Space: O(|S|)
    
    Constraints:
      1 ≤ |S| ≤ 105
      0 ≤ |Si|≤ 9 (And given operators)
*/

import java.util.Scanner;
import java.util.Stack;
class Solution{
	int postFixEvaluation(String S){
		Stack<Integer> s1 = new Stack<Integer>();
	        int res = 0;
        	for(int x = 0;x<S.length();x++){
	            	if(S.charAt(x)>='0' && S.charAt(x)<='9'){
                		s1.push(S.charAt(x) - '0');
            		}
            		else{
                		char ch = S.charAt(x);
                		int a = s1.pop();
                		int b = s1.pop();
                		switch(ch){
                    			case '*':{
                        			res = b*a;
                        			break;
                    			}
                    			case '/':{
                        			res = b/a;
                        			break;
                    			}
                    			case '+':{
                        			res = b+a;
                        			break;
                    			}
                    			case '-':{
                        			res = b-a;
                        			break;
                    			}
                		}
                		s1.push(res);
            		}
        	}
        	return s1.pop();
	}
}

class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		Solution obj = new Solution();
		int ret = obj.postFixEvaluation(str);
		System.out.println(ret);
	}
}
