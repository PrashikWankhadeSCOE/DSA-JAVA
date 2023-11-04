/* 
 * Contains Duplicate (LeetCode-217)
 * 
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * 
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * 
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */

import java.util.*;

class Demo{
	
	/*
	 * O(N)
	 * O(1)
	 */
	static boolean containsDuplicateOpt(int arr[]){
		Set s = new TreeSet();
		for(int i = 0;i<arr.length;i++){
			s.add(arr[i]);
		}

		if(s.size() != arr.length){
			return true;
		}

		return false;
	}
	/*
	 * TC : O(N^2);
	 * SC : O(1);
	 */
	static boolean containsDuplicate(int[] arr) {
	        for(int i = 0;i<arr.length;i++){
        	    	for(int j = i+1;j<arr.length;j++){
                		if(arr[i]==arr[j])
                		return true;
        	    	}
	        }
        	return false;
    	}
	public static void main(String []a){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicateOpt(arr));
	}
}
