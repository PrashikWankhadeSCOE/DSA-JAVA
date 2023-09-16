package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program28 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(removeDuplicate(arr));
    
    }
    static List<Integer> removeDuplicate(int []arr){
        List<Integer> al = new ArrayList<Integer>();
        //int x = 0;
        for(int i =0;i< arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    count++;
                }
            }
            if(count>=arr.length-1){
                al.add(arr[i]);
            }
        }
        return al;
    }

}
