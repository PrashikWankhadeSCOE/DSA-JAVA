package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program30 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter no you want to check");
        int k = Integer.parseInt(br.readLine());

        System.out.println(nearestElement(k,arr));
    }
    static int nearestElement(int k,int[] arr){
        int nearest = 0;

        int diff = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(Math.abs(k-arr[i])<=diff){
                Math.abs(diff= k-arr[i]);
                nearest = arr[i];
            }
        }
        return nearest;
    }
}
