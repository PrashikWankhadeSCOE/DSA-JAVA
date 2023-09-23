
package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Program23 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        long [] ar = minAndSecMin(arr);
        for(long i : ar){
            System.out.print(i +" ");
        }
    }
    static long[] minAndSecMin(int[]arr){
        long min = Integer.MAX_VALUE;
        long secmin = Integer.MAX_VALUE;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]<min){
                secmin = min;
                min = arr[i];
            }
            if(arr[i]<secmin && arr[i]!=min){
                secmin = arr[i];
            }
        }
        long [] ar = {min,secmin};
        long [] r = {-1};
        if(secmin!=Integer.MAX_VALUE)
        return ar;
        else
        return r;
    }
}
