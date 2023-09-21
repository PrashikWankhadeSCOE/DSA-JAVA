//Not Done
package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program30 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the product");
        int k = Integer.parseInt(br.readLine());
        
        System.out.println(countSubArrayProductLessThanK(arr1,k));
    }
    public static long countSubArrayProductLessThanK(int[] arr1, long k){
        long count = 0;
        for(int i = 0;i<arr1.length;i++){
            long pro = 1;
            int x =i;
            for(int j=i;j<arr1.length;j++){
                if(x==j){
                    pro = pro*arr1[j];
                    x++;
                }
                else{
                    break;
                }
                if(pro<k){
                    count++;
                }
            }
        }
        return count;
    }
}
