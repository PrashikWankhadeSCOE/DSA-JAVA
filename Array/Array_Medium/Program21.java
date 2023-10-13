/*
 * 21] Kadane's Algorithm
 * 
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at
 * least one number) which has the maximum sum and return its sum.
 * 
 * Example 1:
 *  Input:
 *   N = 5
 *   Arr[] = {1,2,3,-2,5}
 *  Output:
 *   9
 * 
 * Explanation:
 *  Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous
 *  subarray.
 * 
 * Example 2:
 *  Input:
 *   N = 4
 *   Arr[] = {-1,-2,-3,-4}
 *  Output:
 *   -1
 * 
 * Explanation:
 *  Max subarray sum is -1 of element (-1)
 * 
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * 
 * Constraints:
 *  1 ≤ N ≤ 10^6
 *  -10^7 ≤ A[i] ≤ 10^7
 */
package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program21 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(kadaneAl(arr));
    }
    static int kadaneAl(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int sum=0;
            for(int j = i;j<arr.length;j++){
                sum +=arr[j];
                if(sum>max)
                max = sum;
            }
        }
        return max;
    }
}
