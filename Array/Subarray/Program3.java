/*
 * 3) Largest subarray of 0's and 1's
 * 
 * Given an array of 0s and 1s. Find the length of the largest subarray with
 * equal number of 0s and 1s.
 * 
 * Example 1:
 * Input:
 * N = 4
 * A[] = {0,1,0,1}
 * Output: 4
 * 
 * Explanation: The array from index [0...3]
 * contains equal numbers of 0's and 1's.
 * Thus maximum length of subarray having
 * equal number of 0's and 1's is 4.
 * 
 * Example 2:
 * Input:
 * N = 5
 * A[] = {0,0,1,0,0}
 * Output: 2
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 * 
 * Constraints:
 * 1 <= N <= 10^5
 * 0 <= A[] <= 1
 */

import java.util.*;

class Demo{
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 *
	 */
	static int largest(int arr[]){
		int len = 0;
		for(int i = 0;i<arr.length;i++){
			int zero = 0;
			int one = 0;
			for(int j = i;j<arr.length;j++){
				if(arr[j] == 1)
					one++;
				else
					zero++;
				if(zero == one && len<j-i+1)
					len = j-i+1;
			}
		}
		return len;
	}
	public static void main(String [] at){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i =0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(largest(arr));
	}
}
