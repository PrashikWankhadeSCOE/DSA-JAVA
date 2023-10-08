/*
 * Que 7 ;
 * Leaders in an array 
 *
 * Problem Description 
 * - Given an integer array A containing N distinct integer, you have to find all the 
 *   leader in array A. an element is a leader if it is strictly greater than all the 
 *   element to its right side
 *
 *   Note : The rightmost element is always a leader 
 *    
 *
 *   Problem Costrainsts
 *
 *    1<= N <= 10^5
 *    1<= A[i] <= 10^8
 *
 *   Example 
 *   Input :
 *    A = [16,17,4,3,5,2]
 *   Output :
 *    [17,2,5]
 *
 *   Example :
 *   Input :
 *    A = [5,4]
 *   Output :
 *    [5,4]
 */

import java.io.*;
import java.util.*;
class Demo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		Set al = leaderInArray(arr,N);
		System.out.println(al);
	}
	/*
	 * TC : O(N*N)
	 * SC : O(N);
	 */
	static Set leaderInArray(int arr[],int N){
		Set al = new LinkedHashSet();
		int max = Integer.MIN_VALUE;
		for(int i = N-1;i>=0;i--){
			for(int j = N-1;j>=i;j--){
				if(arr[j]>max)
					max = arr[j];
			}
			al.add(max);
		}
		return al;
	}
}
