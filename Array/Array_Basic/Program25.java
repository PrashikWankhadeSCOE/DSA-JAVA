package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Program25 {
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
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        //Arrays.sort(arr);
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>max){
                //secMax = arr[i];
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]>secMax && arr[i]!=max){
                secMax= arr[i];
            }
        }
        return max*secMax;
    }
}
