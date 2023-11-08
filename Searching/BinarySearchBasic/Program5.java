/*
 * Implement binary search to find the element closest to a given target in a sorted
 * array.
 * For example, given the input array arr = [1, 2, 4, 7, 9] and the target element 6, the
 * function should return 7, as 7 is the closest element to 6 in the array.
 *
 */


import java.util.*;

class Demo{

        int closestRec(int arr[],int k,int s,int e){
                if(s>e)
                        if(k-arr[e]>=arr[s]-k)
				return arr[s];
			else
				return arr[e];

                int mid = (s+e)/2;
                if(arr[mid]==k){
                 
                        return arr[mid];
                }
                else if(arr[mid]>k){
                        return closestRec(arr,k,s,mid-1);
                }
                else
                        return closestRec(arr,k,mid+1,e);

        }
        int closest(int arr[],int k){
                int s = 0;
		int e = arr.length-1;
		while(s<e){
			int mid = (s+e)/2;
			if(arr[mid] == k)
				return mid;
			else if(arr[mid]>k)
				e = mid-1;
			else
				s = mid+1;
		}
		if(k-arr[e] > arr[s]-k)
			return arr[s];
		return arr[e];
	}

        public static void main(String []a){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i = 0;i<arr.length;i++){
                        arr[i] = sc.nextInt();
                }
                int k = sc.nextInt();
                System.out.println(new Demo().closest(arr,k));
                System.out.println(new Demo().closestRec(arr,k,0,arr.length-1));
        }
}
