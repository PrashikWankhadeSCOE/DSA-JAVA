package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program27 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr1[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        int arr2[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr2.length;i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter no you want to check");
        int x = Integer.parseInt(br.readLine());

        System.out.println(countPairSum(x,arr1,arr2));
    }
    static int countPairSum(int sum,int [] arr1,int[]arr2){
        int count = 0;

        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i]+arr2[j] == sum){
                    count++;
                }
            }
        }
        return count;
    }
}
