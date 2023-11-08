/*
 * 
 * Q 4. Last Occurrence of an Element
 * modify the binary search function to find the last occurrence of a given element in
 * a sorted array.
 * For instance, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element 4,
 * the function should return 3, as 4 last appears at index 3 in the array.
 *
 */


import java.util.*;

class Demo{
        int lastOccRec(int arr[],int k,int s,int e){
                if(s>e)
                        return -1;
                int mid = (s+e)/2;
                if(arr[mid]==k){
                        while(mid>0 && arr[mid] == k){
                                mid++;
                        }
                        return mid-1;
                }
                else if(arr[mid]>k){
                        return lastOccRec(arr,k,s,mid-1);
                }
                else
                        return lastOccRec(arr,k,mid+1,e);

        }
        int lastOcc(int arr[],int k){
                int s = 0;
                int e = arr.length-1;
                while(s<e){
                        int mid = (s+e)/2;
                        if(arr[mid] == k){
                                while(mid>0 && arr[mid]==k){
                                        mid++;
                                }
                                return mid-1;
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
                System.out.println(new Demo().lastOcc(arr,k));
                System.out.println(new Demo().lastOccRec(arr,k,0,arr.length-1));
        }
}
