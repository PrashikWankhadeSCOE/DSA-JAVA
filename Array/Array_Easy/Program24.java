package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program24 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(building(arr));
    }
    static int building(int arr[]){
        int count =1;
        int x = arr[0];
        for(int i =0;i<arr.length;i++){
            try{
                if(x<=arr[i+1]){
                    count++;
                    x=arr[i+1];
                }
            }catch(ArrayIndexOutOfBoundsException ar){
                
            }
        }
        return count;
    }
}
