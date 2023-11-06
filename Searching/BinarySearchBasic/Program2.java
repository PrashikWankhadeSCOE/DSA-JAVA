/*
 * Given a sorted array of size N and an integer K, find the position (0 based
 * indexing) at which K is present in the array using binary search
 *
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
	public static void main(String []a){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i = 0;i<arr.length;i++){
                        arr[i] = sc.nextInt();
                }
                int k = sc.nextInt();
                System.out.println(new Demo().recursion(arr,k,0,arr.length-1));
        }
}
