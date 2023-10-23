//Not done
//
/* 
 * 10) Find Maximum Sum Strictly Increasing Subarray
 * Given an array of positive integers. Find the maximum sum of strictly
 * increasing subarrays.
 * Example 1:
 * Input :
 * arr[] = {1, 2, 3, 2, 5, 1, 7}
 * Output :
 * 8
 * Explanation :
 * Some Strictly increasing subarrays are -
 * {1, 2, 3} sum = 6,
 * {2, 5} sum = 7,
 * {1, 7} sum = 8,
 * 
 * maximum sum = 8
 * 
 * Example 2:
 * Input:
 * arr[] = {1, 2, 2, 4}
 * Output:
 * 6
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * Constraints:
 * 1 ≤ N ≤ 10^5
 * 1 ≤ A[i] ≤ 1000
 *
 */

import java.util.*;

class Demo{
	static int maxSum(int arr[]){
		int maxsum = 0;
		for(int i = 0;i<arr.length;i++){
			int sum = 0;
			for(int j = i;j<arr.length;j++){
				
				sum=sum+arr[j];
				
				System.out.print(arr[j]+" ");
				
				if(sum > maxsum && (i==j || arr[j]>arr[j-1])){
					maxsum = sum;
				}
				else if(arr[j-1]>arr[j]){
					break;
				}
				System.out.println(maxsum);
			}
		}
		return maxsum;
				
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(maxSum(arr));
	}
}
