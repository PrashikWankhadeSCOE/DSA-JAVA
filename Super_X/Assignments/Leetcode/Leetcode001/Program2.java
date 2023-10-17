/* 
 * 
 * Search Insert Position (LeetCode 35)
 * 
 * Given a sorted array of distinct integers and a target value, return the index if the target
 * is found. If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 *  Input: nums = [1,3,5,6], target = 5
 *  Output: 2
 * 
 * Example 2:
 *  Input: nums = [1,3,5,6], target = 2
 *  Output: 1
 * 
 * Example 3:
 *  Input: nums = [1,3,5,6], target = 7
 *  Output: 4
 * Constraints:
 *  1 <= nums.length <= 10^4
 *  -10^4 <= nums[i] <= 10^4
 *  nums contains distinct values sorted in ascending order.
 *  -10^4 <= target <= 10^4
 */

import java.io.*;

class Demo{
        public static void main(String [] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int N = Integer.parseInt(br.readLine());

                int arr[] = new int[N];

                for(int i = 0;i<N;i++){
                        arr[i] = Integer.parseInt(br.readLine());
                }

                int target = Integer.parseInt(br.readLine());

		System.out.println(pos(arr,target));
        }
	/*
	 * TC : O(N)
	 * SC : O(1)
	 */
	static int pos(int arr[],int target){
		int c = 0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i] < target)
				c++;
			else 
				break;
		}
		return c++ ;
	}
}

