package Array_Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program15 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());

        int arr1[] = new int [n1];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter the index");
        int k = Integer.parseInt(br.readLine());

        System.out.println(IPL(arr1,k));
    }
    static List<Integer> IPL(int [] arr,int k){
        List<Integer> al = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            int max=0;
            if(i+k>arr.length)
                break;
            for(int j = i;j<i+k;j++){
                if(arr[j]>max)
                max = arr[j];
            }
            al.add(max);
        }
        return al;
    }
}
