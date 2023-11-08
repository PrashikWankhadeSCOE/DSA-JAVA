/* First Occurance of an Elemgnt 
 *
 * Modify the binary search function to find the first occurance of a given element 
 * in a sorted array. Return -1 if he element is not present 
 *
 * for example, given the input array arr = [2,4,4,4,6,7,8]
 * and the target element is 4, the function should return 1 
 * as 4 first appears at index 1 in the array
 *
 */

import java.util.*;

class Demo{
	int firstOccRec(int arr[],int k,int s,int e){
		if(s>e)
			return -1;
		int mid = (s+e)/2;
		if(arr[mid]==k){
			while(mid>0 && arr[mid] == k){
				mid--;
			}
			return mid+1;
		}
		else if(arr[mid]>k){
			return firstOccRec(arr,k,s,mid-1);
		}
		else
			return firstOccRec(arr,k,mid+1,e);

	}
	int firstOcc(int arr[],int k){
		int s = 0;
		int e = arr.length-1;
		while(s<e){
			int mid = (s+e)/2;
			if(arr[mid] == k){
				while(mid>0 && arr[mid]==k){
					mid--;
				}
				return mid+1;
			}
			else if(arr[mid]>k)
				e = mid-1;
			else
				s = mid+1;
		}
		return -1;
	}
	public static void main(String []a){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i = 0;i<arr.length;i++){
                        arr[i] = sc.nextInt();
                }
                int k = sc.nextInt();
                System.out.println(new Demo().firstOcc(arr,k));
		System.out.println(new Demo().firstOccRec(arr,k,0,arr.length-1));
        }
}


