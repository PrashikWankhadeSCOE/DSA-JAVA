package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program43 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter starting number");
        int num1 = Integer.parseInt(br.readLine());
        
        System.out.println("Enter starting number");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println(countBWn1andn2(arr,num1,num2));
    }
    static int countBWn1andn2(int [] arr,int num1,int num2){
        //int count = 0;
        int fc = Integer.MAX_VALUE;
        int lc = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(num1 == arr[i] && fc>i){
                fc=i;
            }
            if(num2 == arr[i] && lc<i){
                lc =i-1;
            }
        }
        if(num1==num2 && lc-fc==-1)
        return 0;
        return lc-fc;
    }
}
