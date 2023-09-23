//Not Done
package ArrayBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Program22 {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int [n];
        
        System.out.println("Enter Elements in array");
        for(int i=0 ;i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(exceptionallyOdd(arr));
    }
    static int exceptionallyOdd(int [] arr){
        int x = -1;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] ){
                    count++;
                }
            }
            if(count%2!=0){
                x = arr[i];
                break;
            }
        }
        return x;
    }
}
