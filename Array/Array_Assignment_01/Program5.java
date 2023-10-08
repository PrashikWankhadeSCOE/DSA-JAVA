/*
 * In place prefix sum
 *
 * Problem Description :
 * - Given an array A of N integer 
 * - Construct the prefix sum of the array in the given array itself
 *
 * Problem Constraints
 * 1<= N <= 10^5
 * 1<= A[i] <= 10^3
 *
 * Example 1 : 
 * Input : 
 * A = [1,2,3,4,5]
 *
 * Output :
 * [1,3,6,10,15]
 *
 * Example 2 :
 * Input :
 * A = [4,3,2]
 *
 * Output 
 * [4,7,9]
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] p){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[] = new int[N];
		
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		
		arr = preffixSum(arr,N);
		
		for(int i : arr){
			System.out.print(i+" ");
		}

	}
	/*
	 * TC : O(N)
	 * SC : O(1)
	 */
	static int[] preffixSum(int arr[],int N){
		for(int i = 1;i<N;i++){
			arr[i]=arr[i]+arr[i-1];
		}
		return arr;
	}
}

