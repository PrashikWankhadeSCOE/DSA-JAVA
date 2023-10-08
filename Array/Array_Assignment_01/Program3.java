/*
 * Que 3 :
 * Range Sum query
 *
 * Problem Description :
 * -You are fiven an integer array A of length N
 * -You are given a 2D integer array B with dimension M*2 , where each row demoted a[L,R] query.
 * -More formally, fid A[L]+ A[L+1] + A[L+2]+....+A[R-1]+A[R] for each query
 *
 *  Problem Constraints
 *  1<=N,M<=10^3
 *  1<=A[i]<=10^5
 *  0<=L<=R<N
 *
 *  Example 1 
 *  
 *  Input :
 *  A = [1,2,3,4,5]
 *  B = [[0,3][1,2]]
 *
 *  Output :
 *  [10,5]
 *
 *  Example 2 :
 *  
 *  Input :
 *  A = [2,2,2]
 *  B = [[0,3][1,2]]
 *
 *  Output:
 *  [2,4]
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] arg){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int [N];

		for(int i= 0;i<N;i++){
			A[i] = sc.nextInt();
		}
		System.out.println("for array B ");
	
		int M = sc.nextInt();
	
		int B[][] = new int [M][2];

		for(int i = 0;i<M;i++){
			for(int j = 0;j<2;j++){
				B[i][j] = sc.nextInt();
			}
		}

		int arr[] = rangeSum(A,B,N,M);
		
		for(int i : arr){
			System.out.println(i);
		}
	}

	/*
	 * TC : O(M*N)
	 * SC : O(M)
	 */
	static int [] rangeSum(int [] A,int B[][] ,int N,int M){
		
		int arr[] = new int[M];

		for(int i =0;i<M;i++){
			int sum = 0;
			int a = B[i][0];
			int b = B[i][1];
			for(int j = a; j<=b;j++){
				sum = sum + A[j];
			}
			arr[i] = sum;
		}
		return arr;
	}
}
