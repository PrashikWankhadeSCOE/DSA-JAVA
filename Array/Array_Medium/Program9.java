package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program9 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the size of array");
        int n2 = Integer.parseInt(br.readLine());

        int arr2[] = new int [n2];
        
        System.out.println("Enter Elements in array 2");
        for(int i=0 ;i< arr2.length;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter the index");
        int k = Integer.parseInt(br.readLine());

        System.out.println(kthofTwoArrays(arr1,arr2,k));
    }
    static long kthofTwoArrays(int arr1[],int []arr2,int k){
        long rr [] = new long[arr1.length+arr2.length];
        for(int i =0;i<rr.length;i++){
            if(i<arr1.length){
                rr[i]=arr1[i];
            }
            else{
                rr[i]=arr2[i-arr1.length];
            }
        }
        long temp = 0;
        for(int i = 0;i<rr.length;i++){
            for(int j = i+1;j<rr.length;j++){
                if(rr[i]>rr[j]){
                    temp = rr[i];
                    rr[i]= rr[j];
                    rr[j] = temp;
                }
            }
        }
        return rr[k-1];
    }
}
