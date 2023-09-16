package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program35 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter no of elements");
        int k = Integer.parseInt(br.readLine());

        System.out.println(minProkInt(k,arr));
    }
    static int minProkInt(int k,int[] arr){
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int pro = 1;
        for(int i = 0;i<k;i++){
            pro=pro*arr[i];
        }
        return pro;
    }
}
