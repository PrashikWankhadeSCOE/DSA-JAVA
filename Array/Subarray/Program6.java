/*
 * 6) Smallest subarray with sum greater than x
 * 
 * Given an array of integers (A[]) and a number x, find the smallest subarray
 * with sum greater than the given value. If such a subarray does not exist,
 * return 0 in that case.
 * 
 * Example 1:
 * Input:
 * A[] = {1, 4, 45, 6, 0, 19}
 * x = 51
 * Output: 3
 * Explanation:
 * Minimum length subarray is
 * {4, 45, 6}

 * Example 2:
 * Input:
 * A[] = {1, 10, 5, 2, 7}
 * x = 9
 * Output: 1
 * Explanation:
 * Minimum length subarray is {10}
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * Constraints:
 * 1 ≤ N, x ≤ 10^5
 * 0 ≤ A[] ≤ 10^4
 *
 */

import java.util.*;

class Demo{
	static int smallestSubarray(int arr[],int x){
		int minlen= Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++){
			int sum = 0;
			for(int j = i+1;j<arr.length;j++){
				sum = sum+ arr[j];
				if(sum>x && minlen>j-i){
					minlen = j-i;
					break;
				}
			}

		}
		return minlen;
	}
	public static void main(String [] ags){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[] = new int[n];

                for(int i = 0;i<arr.length;i++){
                        arr[i] = sc.nextInt();

                }
		int x = sc.nextInt();
                System.out.println(smallestSubarray(arr,x));
        }
}
