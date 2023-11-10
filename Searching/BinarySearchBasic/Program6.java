/*
 * Modify the binary search to find a peak element in a given array.
 * For example, in the array [1, 3, 20, 4, 1, 0], 20 is a peak element because it is
 * greater than its neighbors 3 and 4.
 *
 */

import java.util.*;

class Demo{
	int peakEleBinary(int [] arr,int start,int end){
		if(start<=end){
			int mid=start+ (end-start)/2;

			if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==arr.length-1 || arr[mid] >=arr[mid+1])){
			       return arr[mid];
			}
		       	
			if(mid<arr.length -1 && arr[mid]<arr[mid+1])
			       return peakEleBinary(arr,mid+1,end);
		       	
			return peakEleBinary(arr,start,mid-1);	       
		}
		return -1;
	}
	int peakEleBrute(int []arr){
		for(int i = 1;i<arr.length-1;i++){
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
				return arr[i];
		}
		return arr[arr.length-1];

	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println(new Demo().peakEleBrute(arr));
		System.out.println(new Demo().peakEleBinary(arr,0,n-1));
	}
}
