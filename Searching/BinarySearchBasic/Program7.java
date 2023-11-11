/*
 * Given a sorted binary array consisting of only 0s and 1s, write a program to count
 * the number of 1s in the array using binary search.
 * For example, given the input array arr = [0, 0, 1, 1, 1, 1, 1], the function should
 * return 5 as there are five occurrences of the digit 1 in the array.
 */

import java.util.*;

class Demo{
	int noofOnes(int arr[],int start,int end){
		if(start<=end){
			int mid= start+(end-start)/2;

			if(arr[mid] ==1 && (mid==0 || arr[mid-1]==0)){
				return (end-mid+1)+noofOnes(arr,start,mid-1);
			}
			if(arr[mid]==0){
				return noofOnes(arr,mid+1,end);
			}
			return noofOnes(arr,start,mid-1);
		}
		return 0;
	}
	/*
	int noofOnes(int arr[]){
		int start = 0;
		int end = arr.length-1;
		while(start<end){
			int mid= start+ (end-start)/2;
			if(arr[mid]==1 && (mid ==0 || arr[mid-1]==0)){
				return arr.length-mid;
			}
			if(arr[mid]==0){
				start = mid+1;
			}
			else{
				end = mid-1;
			}
		}
		return -1;
	}
	*/
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(new Demo().noofOnes(arr,0,arr.length-1));
	}
}
