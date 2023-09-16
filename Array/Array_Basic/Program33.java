package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program33 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(mulLefRigSum(arr));
    }
    static int mulLefRigSum(int [] arr){
        int fsum = 0;
        int lsum = 0;
        for(int i = 0;i<arr.length;i++){
            if(i<arr.length/2)
                fsum = fsum+arr[i];
            else
                lsum = lsum+arr[i];
        }
        return fsum*lsum;
    }
}
