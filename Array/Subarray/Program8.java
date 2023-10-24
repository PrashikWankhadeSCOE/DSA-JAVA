/* 
 * 8) Maximum Product Subarray
 * 
 * Given an array Arr[] that contains N integers (may be positive, negative or
 * zero). Find the product of the maximum product subarray.
 * 
 * Example 1:
 * Input:
 * N = 5
 * Arr[] = {6, -3, -10, 0, 2}
 * Output: 180
 * Explanation: Subarray with maximum product
 * is [6, -3, -10] which gives the product as 180.
 * 
 * Example 2:
 * Input:
 * N = 6
 * Arr[] = {2, 3, 4, 5, -1, 0}
 * Output: 120
 * Explanation: Subarray with maximum product
 * is [2, 3, 4, 5] which gives the product as 120.
 * 
 * Note: Use 64-bit integer data type to avoid overflow.
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * Constraints:
 * 1 ≤ N ≤ 500
 * -10^2 ≤ Arri ≤ 10^2
 */

import java.util.*;
class Demo{
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 *
	 */
	static int maxPro(int arr[]){
		int maxPro = Integer.MIN_VALUE;

		for(int i = 0;i<arr.length;i++){
			int pro = arr[I];

			if(pro>maxPro){
				maxPro = pro;
			}
			for(int j = i+1 ; j<arr.length;j++){
				
				pro = pro*arr[j];

				if(pro>maxPro){
					maxPro = pro;
				}			}
		}
		return maxPro;
	}
	public static void main(String [] ags){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[] = new int[n];

                for(int i = 0;i<arr.length;i++){
                        arr[i] = sc.nextInt();

                }
                System.out.println(maxPro(arr));
        }
}
