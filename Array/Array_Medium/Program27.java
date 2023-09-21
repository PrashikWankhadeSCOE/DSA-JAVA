package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program27 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println(missingNumber(arr1));
    }
    static int missingNumber(int arr[]){
        int x = 1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x || arr[0]==x){
                x++;
                i=0;
            }
        }
        return x;
    }
}
