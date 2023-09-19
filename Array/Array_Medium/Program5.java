package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program5 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter k");
        int k = Integer.parseInt(br.readLine());

        System.out.println(kLargeNumber(arr,k));
    }
    public static List<Integer> kLargeNumber(int arr[], int k){

        List<Integer> al = new ArrayList<Integer>();
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0;i<k;i++){
            al.add(arr[i]);
        }
        return al;
    }
}
