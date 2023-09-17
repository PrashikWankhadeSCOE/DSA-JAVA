package ArrayEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n-1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(missingNum(arr));
    }
    static int missingNum(int [] arr){
        int x = 0;
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(i+1!=arr[i]){
                x = arr[i]-1;
                break;
            }
        }
        return x;
    }
}
