/*
 * Que 2 : 
 * Linear Search - Multiple Occurance
 * 
 * Problem Description 
 * Given an array A and an integer B, Find the number of occurance of B in A
 *
 * Problem Constraints
 * 1<=B,A[i]<=10^9
 * 1<=length(A)<=10^5
 *
 * Example :
 * Input : 
 * A = [1,2,2]
 * B = 2 
 *
 * Output :
 * 2
 * 
 * Explanation :
 * Element at index 2, 3 is equal to 2 hence count is 2
 *
 * Example 2 :
 * Input : 
 * A = [1,2,1]
 * B = 3
 *
 * Output :
 * 0
 *
 * Explanation :
 * there is no element equal to 3 in a array 
 *
 */

import java.util.*;
class Demo{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int [N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int B = sc.nextInt();
		System.out.println(mulOcc(arr,B,N));
	}

	/*
	 *
	 * TC : O(N);  ie length of the array independent of the number in array and B
	 * SC : O(1);
	 *
	 */
	static int mulOcc(int arr[],int B,int N){
		int count = 0;
		for(int i = 0;i<N;i++){
			if(arr[i] == B)
				count++;
		}
		return count;
	}
}

