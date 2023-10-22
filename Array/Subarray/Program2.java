/*
 * 2) Equal Left and Right Subarray Sum
 *
 * Given an array A of n positive numbers. The task is to find the first index in
 * the array such that the sum of elements before it is equal to the sum of
 * elements after it.
 * 
 * Note: Array is 1-based indexed.
 * 
 * Example 1:
 * Input:
 * n = 5
 * A[] = {1,3,5,2,2}
 * Output: 3
 * 
 * Explanation: For second test case
 * at position 3 elements before it
 * (1+3) = elements after it (2+2).
 *
 * Example 2:
 * Input:
 * n = 1
 * A[] = {1}
 * Output: 1
 * 
 * Explanation:
 * 8 Since its the only element hence
 * it is the only point.
 *
 * Expected Time Complexity: O(N)
 * Expected Space Complexity: O(1)
 *
 * Constraints:
 * 1 <= n <= 10^6
 * 1 <= A[i] <= 10^8
 * 
 */

import java.util.*;

class Demo{
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 */
	static int equalSum(int arr[]){
		
		for(int i = 0;i<arr.length;i++){
			int leftSum = 0;
			int rightSum = 0;
			for(int j = 0;j<i;j++){
				leftSum+=arr[j];
			}
			for(int j = i+1;j<arr.length;j++){
				rightSum+=arr[j];
			}
			
			if(leftSum == rightSum)
				return i;
		}
		return -1;
	}
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(equalSum(arr));
	}
}
