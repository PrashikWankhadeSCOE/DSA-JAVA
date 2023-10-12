/*
 *
 * Problem 9 
 * Given a sorted array arr containing n elements with possibly some duplicate,
 * the task is to find the first and last occrance of element x in the given array
 *
 * Note if the umber x is not found in the array then return both the indices as -1
 *
 * Example 1 :
 * Input :
 * n = 9
 * x = 5
 * arr[] = {1,3,5,5,5,5,67,123,125}
 * Output 
 * 2 5
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] arr = new int[n];

		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		occ(arr,x);
	}
	/*
	 * TC : O(N);
	 * SC : O(1);
	 */
	static void occ(int [] arr,int x){
		int s = 0;
		int e = arr.length-1;
		
		int si = -1;
		int ei = -1;
		while(s<=e){
			if(arr[s]==x)
				si = s;
			if(arr[e]==x)
				ei = e;
			if(si!=-1 && ei!= -1)
				break;
			if(si==-1)
				s++;
			if(ei==-1)
				e--;
		}
		System.out.println(si+ " "+ei);
	}
}
