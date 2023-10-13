
/*
 * 1] Maximum Index
 * 
 * Given an array arr[] of n non-negative integers. The task is to find the maximum of
 * j - i (i<=j) subjected to the constraint of arr[i] <= arr[j].
 * 
 * Example 1:
 *  Input:
 *   n = 9
 *   arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
 *  Output:
 *   6
 *  Explanation:
 *   In the given array arr[1] < arr[7] satisfying the required condition (arr[i] <=
 *   arr[j]) thus giving the maximum difference of j - i which is 6(7-1).
 * 
 * Example 2:
 *  Input:
 *   N = 2
 *   arr[] = {18, 17}
 *  Output:
 *   0
 * Explanation:
 *  We can either take i and j as 0 and 0
 *  or we can take 1 and 1 both give the same result 0.
 *  Expected Time Complexity: O(N)
 *  Expected Auxiliary Space: O(N)
 * Constraints:
 *  1 ≤ N ≤ 10^6
 *  0 ≤ Arr[i] ≤ 10^9
 * 
 */

package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(maxIndex(arr));
    }
    static int maxIndex(int [] A){
        int count = 0;
        for(int i =0;i<A.length;i++){
            for(int j= i+1;j<A.length;j++){
                if(A[i]<=A[j] && count<j-i){
                    count = j-i;
                }
            }
        }
        return count;
    }
}
