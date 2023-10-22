/*
 *
 * 1) Subarray with given sum
 *
 * Given an unsorted array A of size N that contains only positive integers, find
 * a continuous sub-array that adds to a given number S and return the left and
 * right index(1-based indexing) of that subarray.
 *
 * In case of multiple subarrays, return the subarray indexes which come first
 * on moving from left to right.
 *
 * Note:- You have to return an ArrayList consisting of two elements left and
 * right. In case no such subarray exists, return an array consisting of element
 * -1.
 *
 * Example 1:
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements
 * from 2nd position to 4th position
 * is 12.
 *
 * Example 2:
 * Input:
 * N = 10, S = 15
 * A[] = {1,2,3,4,5,6,7,8,9,10}
 * Output: 1 5
 * Explanation: The sum of elements
 * from 1st position to 5th position
 * is 15.
 *
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 *
 * Constraints:
 * 1 <= N <= 10^5
 * 0 <= Ai <= 10^9
 * 0<= S <= 10^9
 *
 */

import java.util.*;

class Demo{
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 */
	static ArrayList subarray(int arr[],int S){
		ArrayList al = new ArrayList();

		for(int i =0;i<arr.length;i++){
			
			int sum = 0;

			for(int j = i;j<arr.length;j++){
				sum = sum + arr[j];
				if(sum == S){
					al.add(i+1);
					al.add(j+1);
					return al;
				}
				else if(sum>S){
					break;
				}
			}
		}
		al.add(-1);
		return al;
		
	}
	/*
	 *
	 * Working on it
	 */
	static ArrayList subarraysum(int arr[],int S){
		ArrayList al = new ArrayList();
	
		for(int i = 0;i<arr.length;i++){
			
		}
		
		al.add(-1);
		return al;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int S = sc.nextInt();

		System.out.println(subarray(arr,S));
	}
}
