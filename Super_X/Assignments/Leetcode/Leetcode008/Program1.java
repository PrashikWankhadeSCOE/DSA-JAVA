/* 
 * Sum of Unique Elements (LeetCode - 1748)
 * 
 * You are given an integer array nums. The unique elements of an array
 * are the elements that appear exactly once in the array.
 * Return the sum of all the unique elements of nums.
 * 
 * Example 1:
 *  Input: nums = [1,2,3,2]
 *  Output: 4
 *  Explanation: The unique elements are [1,3], and the sum is 4.
 * 
 * Example 2:
 *  Input: nums = [1,1,1,1,1]
 *  Output: 0
 *  Explanation: There are no unique elements, and the sum is 0.
 * 
 * Example 3:
 *  Input: nums = [1,2,3,4,5]
 *  Output: 15
 *  Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 * 
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
*/

import java.util.*;

class Demo{
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 */

	static int sumOfUnique(int arr[]){
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			int flag = 0;
			for(int j = 0;j<arr.length;j++){
				if(arr[i] == arr[j] && i!=j){
					flag++;
					break;
				}
			}
			System.out.println(arr[i] +" "+ flag);
			if(flag==0)
				sum = sum+arr[i];
		}
		return sum;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(sumOfUnique(arr));
	}
}
