/*
 * Problem 8
 * Given an unsorted array arr[] of size N . Rotate the array to the left(counter-cloclwisr)
 * direction by D steps, where D is a poseticve integer
 *
 * Example 1 :
 * N = 5
 * D = 2
 * arr[] = {1,2,3,4,5}
 * Output :
 * 3 4 5 1 2 
 *
 * Example 2:
 * N = 10;
 * D = 3
 * arr= {2,4,6,8,10,12,14,16,18,20}
 * Output :
 * 8 10 12 14 16 18 20 2 4 6 
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr [] = new int [n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int D = sc.nextInt();
		arr = rotate(arr,D);
		for(int i : arr){
			System.out.println(i);
		}
	}
	/*
	 * TC : O(N);
	 * SC : O(N);
	 */
	static int [] rotate(int arr[],int D){
		int ret[] = new int[arr.length];
		int x = 0;
		for(int i = D;i<arr.length;i++){
			ret[x] = arr[i];
			x++;
		}
		for(int i = 0;i<D;i++){
			ret[x] = arr[i];
			x++;
		}
		return ret;
	}
}
