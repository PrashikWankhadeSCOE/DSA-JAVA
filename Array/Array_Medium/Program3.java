package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program3 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(zeroSumSubArray(arr));
    }
    static int zeroSumSubArray(int [] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = arr[i];
            if(sum==0)
                count++;
            for(int j= i+1;j<arr.length;j++){
                sum = sum+arr[j];
                //System.out.print(arr[i] + " "+ arr[j]+ "||");
                if(sum==0)
                    count++;
            }
            //System.out.println("");
        }
        return count;
    }
}
