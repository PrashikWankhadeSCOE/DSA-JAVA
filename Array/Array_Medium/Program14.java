package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program14{
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(closestToZero(arr));
    }
    public static int closestToZero (int arr[]){
        int sum = Integer.MAX_VALUE;
        int sum2 = 0;
        for(int i = 0;i<arr.length;i++){
            sum2 = Integer.MAX_VALUE;
            for(int j = i+1;j<arr.length;j++){
                sum2 = arr[i]+arr[j];
                if(Math.abs(sum2)<Math.abs(sum)){
                    sum=sum2;
                }
            }
        }
        return sum;
        //System.out.println(sum);
    }
}