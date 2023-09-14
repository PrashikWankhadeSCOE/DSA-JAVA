package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program12 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter no you want to search for");
        int x = Integer.parseInt(br.readLine());

        System.out.println(firstLastOccurance(x,arr));
    }
    static String firstLastOccurance(int x ,int [] arr){
        int a = -1;
        int b = -1;
        int count = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]==x && count ==0){
                a=i;
                count++;
            }
            else if(arr[i]==x && count>0){
                b=i;
                count++;
            }
        }
        if(count<2){
            return "-1";
        }
        else{
            String str = "First Occurance of the "+ x + "is "+ a +"and last occurance is "+ b + ""; 
            return str;
        }
    }
}
