/*
 *
 * Que 6 :
 * Problem Discription 
 * - Given an array of integer A,Find and return the product array of the same
 *   size where the ith element of the product array will be equal to the product 
 *   of all the elements divided by ith element of the array 
 * - Note : it is always possible to form the product array with integer(32 bit) values 
 *   Solve it without using division operator
 *
 *   Constrains 
 *
 *   2<= length of the array <= 100
 *   1<= A[i] <= 10
 *
 *   For Example 
 *
 *   Input 1 :
 *   A = [1,2,3,4,5]
 *   Output 1 :
 *   [120,60,40,30,24]
 *
 *   Input 2 :
 *   A = [5,1,10,1]
 *   Output 2 :
 *   [10,50,5,50]
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int ret [] = productArray(arr,N);
	        for(int i : ret){
			System.out.print(i+ " ");
		}	
	}

	/*
	 * TC : O(N^2)
	 * SC : O(N)
	 */
	static int[] productArray(int arr[] ,int N){
		int ret[]= new int [N];
		for(int i = 0;i<N;i++){
			int pro = 1;
			for(int j = 0;j<N;j++){
				if(j!=i)
					pro = pro*arr[j];
			}
			ret[i] = pro;
		}
		return ret;
	}
}
