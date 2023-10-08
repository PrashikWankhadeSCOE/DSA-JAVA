/*
 *
 * Que 4 :
 * Problem Description 
 * - Given an integer array A of size N 
 * - In one second, you can increase the value of one element by 1 
 * - find the minimumm time in seconf to make all the elements of array equal
 *
 *   Problem Constraints : 
 *   1<=N<= 1000000
 *   1<=A[i] <= 1000
 *
 *   Example Input :
 *   A = [2,4,1,3,2]
 *   Output : 
 *   8
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] ags){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr [] = new int [N];

		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(timeToEqual(arr,N));

	}
	/*
	 * TC : O(N)
	 * Iterations : N+N
	 * SC : O(1)
	 */
	static int timeToEqual(int arr[],int N){
		
		int max = 0;
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max)
				max = arr[i];
		}
		
		int count = 0;
		
		for(int i = 0;i<N;i++){
			count = count + max - arr[i];
		}
		
		return count;
	}
}


