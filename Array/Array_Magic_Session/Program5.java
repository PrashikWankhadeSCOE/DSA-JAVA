/*
 * Problem 5 :
 *
 * Given an array of size N-1 such that it only contains distinct integer in the range of 1 ot N.
 * Find the missing element.
 *
 * Example 1 :
 * N = 5
 * A[] = {1,2,3,5};
 * Output : 4
 *
 * Input :
 * N = 10;
 * A [] = {6,1,2,8,3,4,7,10,5}
 * Output : 9
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] a){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int [] arr = new int[N-1];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(missingNo(arr));
	}

	static int missingNo(int arr[]){
		int x = 1;

		Arrays.sort(arr);

		for(int i = 0;i<arr.length;i++){
			if(x == arr[i])
			x++;
			else
			return x;
		}
		return x;	
	}
}
