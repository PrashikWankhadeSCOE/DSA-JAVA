/*
 * Problem 7
 *
 * Given an Arr[]] that contains N integer9may be positive,negative or zero). Find the product of the
 * maximum product subarray
 *
 * Example 1 :
 * Input :
 * N = 5
 * Arr[] = {6,-3,-10,0,2}
 *
 * Output 
 * 180
 *
 * Explanation :
 * Subarray with maximum product is [6,-3,-10] which gives the product as 180
 *
 * Example 2 :
 * N = 6
 * Arr[] = {2,3,4,5,-1,0}
 * Output : 120
 *
 * Explanation : 
 * Subarray with maximum product is [2,3,4,5] which gives the product of 120
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] arr = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(maxPro(arr));
	}
	/*
	 *  TC : O(N^2)
	 *  SC : O(1)
	 */
	static int maxPro(int arr[]){
 		int maxPro = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			int pro = 1;
			
			for(int j = 0;j<arr.length;j++){
				pro = pro*arr[j];
				if(pro>maxPro)
					maxPro = pro;
			}
		}
		return maxPro;
	}
}
