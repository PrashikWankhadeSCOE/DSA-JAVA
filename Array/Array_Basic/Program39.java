package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program39 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(leadears(arr));
    }
    static List<Integer> leadears(int [] arr){
        List<Integer> ll = new ArrayList<Integer>();

        for(int i =0;i<arr.length;i++){
            int count=0;
            for(int j = i;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    count++;
                }
                if(count>=arr.length-i-1){
                    ll.add(arr[i]);
                }
            }
        }
        return ll;
    }

}
