/*
 *  Q4. Stack using two queues
 *   Implement a Stack using two queues q1 and q2.
 * 
 *   Example 1:
 *    Input:
 *      push(2)
 *      push(3)
 *   
 *      pop()
 *      push(4)
 *      pop()
 *    Output: 3 4
 *    Explanation:
 *      push(2) the stack will be {2}
 *      push(3) the stack will be {2 3}
 *      pop() poped element will be 3 the
 *      stack will be {2}
 *      push(4) the stack will be {2 4}
 *      pop() poped element will be 4
 *   
 *   Example 2:
 *    Input:
 *      push(2)
 *      pop()
 *      pop()
 *      push(3)
 *    Output: 2 -1
 *   
 *   Expected Time Complexity: O(1) for push() and O(N) for pop() (or vice-versa).
 *   Expected Auxiliary Space: O(1) for both push() and pop().
 *   
 *   Constraints:
 *     1 <= Number of queries <= 100
 *     1 <= values of the stack <= 100
 */


