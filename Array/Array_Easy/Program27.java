package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program27 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        arr = removeDuplicates(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static int[] removeDuplicates(int[] arr) {
        int x =0;
        int rr [] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            try{
                if(arr[i]!=arr[i+1]){
                    rr[x]=arr[i];
                    x++;
                }
            }catch(ArrayIndexOutOfBoundsException ar){
                
            }
        }
        rr[x]=arr[arr.length-1];
        return rr;
    }
}
