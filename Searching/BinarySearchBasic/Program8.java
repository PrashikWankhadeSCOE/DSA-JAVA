/*
 * Write a program to find the index where a given target element should be inserted
 * in a sorted array to maintain the array's sorted order.
 * For example, given the input array sortedArray = [1, 3, 5, 6] and the target element
 * 5, the function should return 2, as 5 is already present at index 2. If the target
 * element is 2, the function should return 1, as inserting 2 at index 1 would maintain
 * the sorted order.
 *
 */
import java.util.*;
class Demo{

	/*
	 * TC : O(logN)
	 * SC : O(1)
	 */
	int insert(int arr[],int target,int start,int end,int x){
		if(start<end){
			int mid = start + (end- start)/2;
			if(arr[mid] == target)
				return mid;
			if(arr[mid]>target){
				x = mid; 
				return insert(arr,target,start,mid,x);
			}
			else{
				x = mid+1;
				return insert(arr,target,mid+1,end,x);
			}
		}
		return x;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println(new Demo().insert(arr,target,0,n-1,-1));
	}
}
