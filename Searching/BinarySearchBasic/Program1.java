// WAP for binary search using recursion as well as while loop approch
//
/*
 * Binary search works on a sorted array not on an unsorted array
 * below is a binary search program
 */

import java.util.*;

class Demo{
	int recursion(int arr[],int search,int s,int e){
		if(s>e)
			return -1;
		int mid = (s+e)/2;
		if(arr[mid] == search)
			return mid;
		else if(arr[mid] > search)
			return recursion(arr,search,s,mid-1);
		else
			return recursion(arr,search,mid+1,e);
	}
	/*
	int recursion(int nums[],int search){
		int s = 0;
		int e = nums.length-1;
		while(s<e){
			int mid = (s+e)/2;
			if(nums[mid] == search)
				return mid;
			else if(nums[mid] > search)
				e = mid-1;
			else
				s = mid+1;
		}
		return -1;
	}
	*/
	public static void main(String []a){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		System.out.println(new Demo().recursion(arr,search,0,arr.length-1));
	}
}
