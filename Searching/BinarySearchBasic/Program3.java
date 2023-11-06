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
	int firstOcc(int arr[],int k){
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
        }
}


