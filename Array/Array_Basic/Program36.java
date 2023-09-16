package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program36 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(peakEle(arr));
    }
    static List<Integer> peakEle(int [] arr){
        List<Integer> al= new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            try{
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    al.add(arr[i]);
                }
            }catch(ArrayIndexOutOfBoundsException ie){
            
            }
        }
        return al;
    }
}
