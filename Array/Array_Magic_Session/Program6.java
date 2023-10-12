/*
 *
 * Problem 6
 *
 * Given an array A of n positive numbers. The task is to find the first equilibrium point in an array
 * Equilibrium point in an array is an index9or position) such that the sum of all elements before
 * that index is the saem as the sum of elements after it
 *
 * Note return equilibrium point in 1 based indexing. Return -1 if no such point exists
 *
 * Example 1 :
 * Input :
 * n = 5
 * A[] = {1,3,5,2,2}
 * Output :
 * 3
 *
 * Example 2 :
 * n = 1 
 * A[] = {1}
 * Output : 
 * 1
 *
 * Constraints :
 * 1<=n<=10^5
 * 1<=A[i]<=10^9
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [] arr = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(equilibriumPoint(arr));
	}
	/*
	 * TC : O(N^2)
	 * SC = O(1)
	 */
	static int equilibriumPoint(int [] arr){
		for(int i = 0;i<arr.length;i++){
			int sumleft = 0;
			int sumright = 0;
			for(int j = 0;j<i;j++)
				sumleft += arr[j];
			for(int j = i+1;j<arr.length;j++)
				sumright += arr[j];
		        if(sumleft==sumright)
				return i+1;
		}
		return -1;
	}
}	
