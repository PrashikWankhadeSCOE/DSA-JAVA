/*
 * Two Sum (LeetCode 1)
 * 
 * Given an array of integers nums and an integer target, return indices of the two
 * numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use
 * the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * Example 1:
 *  Input: nums = [2,7,11,15], target = 9
 *  Output: [0,1]
 *  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 *  Input: nums = [3,2,4], target = 6
 *  Output: [1,2]
 * 
 * Example 3:
 *  Input: nums = [3,3], target = 6
 *  Output: [0,1]
 * 
 * Constraints:
 *  2 <= nums.length <= 10^4
 *  -10^9 <= nums[i] <= 10^9
 *  -10^9 <= target <= 10^9
 * Only one valid answer exists.
 *
 */

import java.io.*;
import java.util.*;
class Demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int arr[] = new int[N];

		for(int i = 0;i<N;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int target = Integer.parseInt(br.readLine());

		int pair [] = twoSum(arr,target,N);

		for(int i: pair){
			System.out.println(i);
		}
	}
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 */
	static int [] twoSum(int [] arr,int target,int N){
		int pair[] = new int[2];

		for(int i = 0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
				if( arr[i] + arr[j] == target){
					pair[0] = i;
					pair[1] = j;
				}
			}
		}
		return pair;
	}
}	

