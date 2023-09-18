package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program26 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(leaders(arr));
    }
    static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> ll = new ArrayList<Integer>();

        for(int i =0;i<arr.length;i++){
            int count=0;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<=arr[i]){
                    count++;
                }
                if(count>=arr.length-i-1){
                    ll.add(arr[i]);
                }
            }
        }
        ll.add(arr[arr.length-1]);
        return ll;
    }
}
