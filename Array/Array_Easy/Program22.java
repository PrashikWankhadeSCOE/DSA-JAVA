package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program22 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the Digit");
        int x = Integer.parseInt(br.readLine());

        System.out.println(leftMostRightMost(arr,x));
    }
    static String leftMostRightMost(int arr[],int x){
        int f = -1;
        int l = -1;
        int z = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                while(z<1){
                    f=i;
                    z++;
                }
                l=i;
            }
        }
        return f+ " "+l;
    }
}
