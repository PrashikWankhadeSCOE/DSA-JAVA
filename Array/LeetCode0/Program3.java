/*
 * Search Insert Position (LeetCode-35)
Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be if it were
inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		System.out.println(index(arr,N,target));

	}
	/*
	 * TC : O(N)
	 * SC : O(1)
	 */
	static int index(int [] arr,int N,int target){
		int x = 0;
		if(target > arr[N-1])
			return N;
		else{
			for(int i = 0;i<N;i++){
			
				if(arr[i]<=target)
					x = i;
				else
					break;
			}
		}
		return x;
	}
	/*
	 * TC : O(LogN)
	 * SC 
	 */
	static int indexOp(int [] arr,int N,int target){
		int x = 0;
		
		int start = 0;
		int end = N-1;

		while(start<end){
			if(
		}
	}	
}


