package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program12 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the number");
        int x = Integer.parseInt(br.readLine());

        System.out.println(numberOfOccurance(arr,x));
    }
    static int numberOfOccurance(int [] arr,int x){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(x==arr[i])
            count++;
        }
        return count;
    }
}
