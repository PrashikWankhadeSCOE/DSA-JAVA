package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program18 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        arr = moveZero(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static int [] moveZero(int [] arr){
        int x = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]!=0){
                    x = arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        return arr;
    }
}
