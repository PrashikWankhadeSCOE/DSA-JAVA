package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program18 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(maxArea(arr1));
    }
    public static int maxArea(int[] arr) {
        int max = 0;
        int max2 = 0;
        for(int i = 0;i<arr.length;i++){
            max2 = 0;
            for(int j= 0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]>arr[j])
                    max2 = Math.abs(i-j)*arr[j];
                    else
                    max2 = Math.abs(i-j)*arr[i];
                }
                if(max2>max){
                    max= max2;
                }
            }
        }
        return max;
    }
}
