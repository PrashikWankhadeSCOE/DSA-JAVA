package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program32 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(maxPro(arr));
    }
    static int maxPro(int [] arr){
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
        int pro=0;
        for(int i = 0;i<arr.length;i++){
            pro=pro+arr[i]*i;
        }
        return pro;
    }
}
