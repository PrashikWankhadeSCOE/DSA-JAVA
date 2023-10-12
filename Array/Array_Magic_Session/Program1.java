/*
 *
 * Problem 1 : 
 * Given an array containing n integers. The problem is to find the sum of the elements 
 * of the contiguous subarray having the smallest(minimum) sum.
 *
 * Example :
 * Input :
 * Arr[3,-4,2,-3,-1,7,-5]
 * Output : -6
 * Subarray is {-4,2,-3,-1}=-6
 * 
 * Input :
 * Arr [2,6,8,1,4]
 * Output :
 * 1
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for(int i = 0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(minSum(arr,N));
	}
	static int minSum(int arr[],int N){
		int sum = Integer.MAX_VALUE;

		for(int i =0;i<arr.length;i++){
			int minSum = 0;
			for(int j= i;j<N;j++){
				minSum = minSum+arr[j];
				if(minSum<sum){
					sum = minSum;
				}
			}
		}
		return sum;
	}
}
