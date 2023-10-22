/*
 * 5) Largest subarray with 0 sum
 * 
 * Given an array having both positive and negative integers. The task is to
 * compute the length of the largest subarray with sum 0.
 * 
 * Example 1:
 * Input:
 * N = 8
 * A[] = {15,-2,2,-8,1,7,10,23}
 * Output: 5
 * Explanation: The largest subarray with
 * sum 0 will be -2 2 -8 1 7.
 * 
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 * 
 * Constraints:
 * 1 <= N <= 10^5
 * -1000 <= A[i] <= 1000, for each valid i
 */

import java.util.*;

class Demo{
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 */
	static int zeroSum(int arr[]){
		int maxLen = 0; 
		for(int i = 0;i<arr.length;i++){
			int sum = arr[i];
			int diff = 0;
			for(int j = i+1;j<arr.length;j++){
				diff = j-i;
				if(diff>maxLen && sum == 0){
					maxLen = diff;
				}
				sum = sum+arr[j];
			}
		}
		return maxLen;
	}

	public static void main(String [] ags){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[] = new int[n];

                for(int i = 0;i<arr.length;i++){
                        arr[i] = sc.nextInt();

                }
                System.out.println(zeroSum(arr));
        }
}
