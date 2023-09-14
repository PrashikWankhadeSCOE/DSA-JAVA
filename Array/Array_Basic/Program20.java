package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program20 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter Sum");
        int x = Integer.parseInt(br.readLine());

        System.out.println(pairSum(x,arr));
    }
    static String pairSum(int x , int [] arr){
        String str = "No";
        for(int i = 0;i<arr.length;i++){
            try{
                if(arr[i]+arr[i+1]==x){
                    str = "Yes";
                }
            }catch(ArrayIndexOutOfBoundsException ae){

            }
        }
        return str;
    }
}
