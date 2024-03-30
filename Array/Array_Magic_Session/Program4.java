/*
 * Problem 4 :
 * Given an array of positive integer nums and a positive integer target,retrn the minimal length
 * of a subarray whose sum is greater than or equal to target. if there is no such subarray return 0 instead
 *
 * Example 1 :
 * Input 
 * target = 7 
 * nums= [2,3,1,2,4,3]
 * Output : 2
 * 
 * Example2 :
 * input target = 4
 * nums = [2,3,1,2,4,3]
 * Output: 1
 */

import java.util.*;

class Demo{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int nums[] = new int[n];
		for(int i = 0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(minSubarray(nums,target));
	}
	static int minSubarray(int nums[],int target){
		int len = nums.length+1;
		int c = 0;
		for(int i = 0;i<nums.length;i++){
			int sum = 0;
			for(int j = i;j<nums.length;j++){
				sum = sum+ nums[j];
				if(sum>=target && j-i+1 < len){
					len=j-i+1;
					c++;
					break;
				}
			}
		}
		if(c==0)
			return 0;
		return len;
	}
}

