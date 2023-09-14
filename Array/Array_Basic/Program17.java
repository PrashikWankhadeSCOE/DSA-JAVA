package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program17 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(minXmax(arr,arr1));
    }
    static int minXmax(int [] arr,int arr1[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //int ar[] = new int[arr.length+arr1.length];
        /*for(int i= 0;i<ar.length;i++){
            if(i<arr.length){
                ar[i]=arr[i];
            }
            else{
                ar[i]=arr1[i-arr.length];
            }
        }*/
        for(int i : arr){
            if(max<i)
            max=i;
        }
        for(int i: arr1){
            if(min>i)
            min=i;
        }
        return min*max;
    }
}
