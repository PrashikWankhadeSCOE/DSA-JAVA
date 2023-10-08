/*
 * Que 1 : 
 * Problem Discription : 
 * -Given an array A of size N
 * -You need to find the sum of the maximum and minimum element in the given array 
 *
 *  Problem Constraints
 *  1<=N<=105
 *  -109<A[i]<=109
 *
 *  Example Input 
 *  Input 1 : 
 *  A = [-2,1,-4,5,3]
 *
 *  Input 2 : 
 *  A = [1,3,4,1]
 *
 *  Example Output : 
 *  Output 1 :
 *  1
 *
 *  Output 2 : 
 *  5
 *
 *  Example explanation 
 *
 *  Explanation 1 : 
 *  maximum element is 5 and minimum element is -4
 *  5+-4 = 1
 *
 *  Explanation 2 :
 *  Maximum element is 4 and minimum is 1 
 *  4+1 = 5
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int [] arr = new int [N];
		
		for(int i = 0;i<N ;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(sumOfMaxandMin(arr,N));
	}
	/*
	 *
	 * TC : O(N)
	 * SC : O(1)
	 *
	 */
	static int sumOfMaxandMin(int arr[],int N){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i = 0;i<N;i++){
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];

		}
		return max+min;
	}
}
