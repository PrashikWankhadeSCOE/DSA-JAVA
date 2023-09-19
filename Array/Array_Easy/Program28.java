package Array_Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        arr = productPuzzle(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
    static int [] productPuzzle(int [] arr){
        int [] rr = new int [arr.length];
        for(int i = 0;i<arr.length;i++){
            int pro = 1;
            for(int j = 0;j<arr.length;j++){
                if(j!=i)
                    pro = pro*arr[j];
            }
            rr[i]=pro;
        }
        return rr;
    }

}
