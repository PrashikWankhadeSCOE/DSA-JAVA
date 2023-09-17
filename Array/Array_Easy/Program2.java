package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int [] rr = sortArr(arr);
        for(int i : rr){
            System.out.println(i);
        }
    }
    static int[] sortArr(int [] arr){
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        return arr;
    }
}
