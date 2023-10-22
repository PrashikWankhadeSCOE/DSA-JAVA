
/*
 * 4) Subarray with 0 sum
 * Given an array of positive and negative numbers. Find if there is a subarray
 * (of size at-least one) with 0 sum.
 * 
 * Example 1:
 * Input:
 * 5
 * 4 2 -3 1 6
 * Output:
 * Yes
 * Explanation:
 * 2, -3, 1 is the subarray
 * with sum 0.
 * 
 * Example 2:
 * Input:
 * 5
 * 4 2 0 1 6
 * Output:
 * Yes
 * Explanation:
 * 0 is one of the element
 * in the array so there exist a
 * subarray with sum 0.
 * 
 * Expected Time Complexity: O(n).
 * Expected Auxiliary Space: O(n).
 * 
 * Constraints:
 * 1 <= n <= 10^4
 * -10^5 <= a[i] <= 10^5
*/

import java.util.*;

class Demo{
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 * here we are returning the length of the subarray 
	 * if not present then returning -1
	 */
	static int subarraywith0sum(int arr[]){
		//int sum = 0 ;
		for(int i = 0;i<arr.length;i++){
			int sum = arr[i];
			for(int j = i+1;j<arr.length;j++){

				System.out.println(sum);
				if(sum == 0)
					return j-i;
				sum = sum+arr[j];
			}
		}
		return -1;
	}
	public static void main(String [] ags){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();

		}
		System.out.println(subarraywith0sum(arr));
	}
}

