package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program7 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(sortedArray(arr));
    }
    static int sortedArray(int [] arr){
        int x = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            try{
                if(arr[i]<=arr[i+1])
                    count++;
                else
                    break;
            }catch(ArrayIndexOutOfBoundsException ie){
            }
            if(count==arr.length-1)
                x = 1;
        }
        return x;
    }
}
